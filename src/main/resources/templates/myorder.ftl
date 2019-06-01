<#assign basepath=request.contextPath />
<!doctype html>
<html lang="en">
<#include "./common/head.ftl">
<body>
<#include "./common/header.ftl">
<section class="site-hero site-hero-innerpage overlay" data-stellar-background-ratio="0.5"
         style="background-image: url(${basepath}/static/images/big_image_1.jpg);">
    <div class="container">
        <div class="row align-items-center site-hero-inner justify-content-center">
            <div class="col-md-12 text-center">
                <div class="mb-5 element-animate">
                    <h1>订单列表</h1>
                    <p>玮琪酒店欢迎您的入驻</p>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- END section -->


<section class="site-section">
    <div class="container">
        <div class="row">
            <#if orderRoomList?exists>
                <#list orderRoomList as item>
                    <div class="col-md-4 mb-4">
                        <div class="media d-block room mb-0">
                            <figure>
                                <img src="${basepath}/static/images/img_${item.nono}.jpg"
                                     alt="Generic placeholder image"
                                     class="img-fluid">
                                <div class="overlap-text">
                                  <span>
                                      <#if item.leib == "1">普通房间</#if>
                                      <#if item.leib == "2">大床房间</#if>
                                      <#if item.leib == "3">豪华房间</#if>
                                  </span>
                                </div>
                            </figure>
                            <div class="media-body">
                                <h3 class="mt-0"></h3>
                                <ul class="room-specs">
                                    <li>预订人：${item.nickname}</li>
                                    <li>手机号：${item.phone}</li>
                                    <li>时间：${item.starttime} - ${item.endtime} </li>
                                    <li>地址：${item.area}</li>
                                    <li>早餐：
                                        <#if item.breakfast == "1">有</#if>
                                        <#if item.breakfast == "2">无</#if>
                                    </li>
                                    <li>价格：${item.price}元/天</li>
                                </ul>
                                <p>留言信息：${item.content}</p>
                                <p><a onclick="delOrderRoom('${item.id}')" class="btn btn-primary btn-sm">删除订单</a></p>
                            </div>
                        </div>
                    </div>
                </#list>
            </#if>

        </div>
    </div>
</section>

<#include "./common/foot.ftl">
</body>
</html>