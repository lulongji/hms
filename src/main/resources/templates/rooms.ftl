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
                    <h1>房间列表</h1>
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
            <#if roomList?exists>
                <#list roomList as item>
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
                                <h3 class="mt-0"><a onclick="orderRoom('${item.roomno}')">点击预定</a></h3>
                                <ul class="room-specs">
                                    <li>地址：${item.area}</li>
                                    <li>早餐：
                                        <#if item.breakfast == "1">有</#if>
                                        <#if item.breakfast == "2">无</#if>
                                    </li>
                                    <li>价格：${item.price}元/天</li>
                                </ul>

                                <p>${item.content}</p>
                                <p><a onclick="orderRoom('${item.roomno}')" class="btn btn-primary btn-sm">马上预定</a></p>
                            </div>
                        </div>
                    </div>
                </#list>
            </#if>

        </div>
    </div>
</section>


<section class="section-cover" data-stellar-background-ratio="0.5"
         style="background-image: url(${basepath}/static/images/img_5.jpg);">
</section>

<#include "./common/foot.ftl">
<script>
    /**
     * 预定房间
     * @param roomno
     */
    function orderRoom(roomno) {
        var token = window.sessionStorage.getItem("username");
        debugger;
        if (null == token) {
            myAlert("请您先登录！", function (f) {
            }, false);
            top.location = ctx + "/login/";
        } else {
            top.location = ctx + "/hms/contact?roomno=" + roomno;
        }
    }

</script>
</body>
</html>