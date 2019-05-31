package com.hms.common.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.UUID;

@Aspect
@Order(-99)
@Configuration
public class WebLogAspect {

    private static final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    /**
     * 定义切点Pointcut
     * 第一个*号：表示返回类型， *号表示所有的类型
     * 第二个*号：表示类名，*号表示所有的类
     * 第三个*号：表示方法名，*号表示所有的方法
     * 后面括弧里面表示方法的参数，两个句点表示任何参数
     */
    @Pointcut("execution(public * com.*.*.controller.*.*(..))")
    public void weblog() {

    }


    /**
     * 方法调用之前调用
     *
     * @param joinPoint
     */
    @Before(value = "weblog()")
    public void doBefore(JoinPoint joinPoint) {
        String requestId = String.valueOf(UUID.randomUUID());
        MDC.put("requestId", requestId);

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        logger.info("HTTP URL : " + request.getRequestURL().toString());
        logger.info("HTTP METHOD : " + request.getMethod());
        logger.info("CLASS METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "."
                + joinPoint.getSignature().getName());
        logger.info("PARAMS : " + Arrays.toString(joinPoint.getArgs()));
    }

    /**
     * 方法之后调用
     *
     * @param joinPoint
     * @param returnValue
     */
    @AfterReturning(pointcut = "weblog()", returning = "returnValue")
    public void doAfterReturning(JoinPoint joinPoint, Object returnValue) {
        logger.info("=====>@AfterReturning：The response parameter is：{}", returnValue);
        MDC.clear();
    }

    /**
     * 统计方法执行耗时Around环绕通知
     *
     * @param joinPoint
     * @return
     */
    @Around("weblog()")
    public Object timeAround(ProceedingJoinPoint joinPoint) {
        long startTime = System.currentTimeMillis();
        Object obj = null;
        try {
            obj = joinPoint.proceed();
        } catch (Throwable e) {
            logger.error("=====>Counts the elapsed time of a method execution to surround notification errors:", e);
        }
        long endTime = System.currentTimeMillis();
        logger.info("=====>Processing this request takes time:{} ms", endTime - startTime);
        return obj;
    }
}
