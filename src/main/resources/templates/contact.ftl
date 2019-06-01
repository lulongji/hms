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
                    <h1>房间预定</h1>
                    <p>欢迎您入驻我们的酒店，您有什么意见或者建议欢迎留言，我们及时处理。</p>
                </div>

            </div>
        </div>
    </div>
</section>
<!-- END section -->

<section class="site-section">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <h2 class="mb-5">预定信息</h2>
                <input type="hidden" id="roomnoval" value="${roomnoval}">
                <div class="row">
                    <div class="col-md-12 form-group">
                        <label for="name">注意：预定请您先登录后在预定。</label>
                    </div>
                    <div class="col-md-12 form-group">
                        <label for="name">住店时间：</label>
                        <input type="date" value="2015-09-24" id="starttime"/>
                    </div>
                    <div class="col-md-12 form-group">
                        <label for="name">离店时间：</label>
                        <input type="date" value="2015-09-24" id="endtime"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 form-group">
                        <label for="name">姓名</label>
                        <input type="text" id="nickname" class="form-control ">
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 form-group">
                        <label for="phone">电话</label>
                        <input type="text" id="phone" class="form-control ">
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 form-group">
                        <label for="phone">数量</label>
                        <input type="phone" id="numcount" class="form-control ">
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 form-group">
                        <label for="message">留言</label>
                        <textarea name="message" id="message" class="form-control " cols="30" rows="8"></textarea>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 form-group">
                        <input type="submit" value="提交预定" class="btn btn-primary" id="subbookroom"
                               onclick="subRoomOrder();">
                    </div>
                </div>
            </div>
            <div class="col-md-1"></div>
            <div class="col-md-5">
                <h3 class="mb-5">房间展示</h3>
                <p class="mb-5"><img src="${basepath}/static/images/img_4.jpg" alt="" class="img-fluid"></p>
                <p>
                    韦琪酒店是北京市朝阳区人民政府投资开发的一间酒店。2004年被全国旅游星级饭店评定委员会评为三星酒店，2005年被广东省旅游星级饭店评定委员会评为绿色酒店。酒店临近珠海著名景点圆明新园、梦幻水城、四大佛山、梅溪牌坊等。</p>
                <p>酒店距珠海著名景点圆明新园、梦幻水城、四大佛山近在咫尺。酒店距拱北口岸（澳门海关）5公里；距九洲港码头11公里；据珠海机场40公里，去中旅渡假城海泉湾本酒店是必经之路。</p>
            </div>
        </div>
    </div>
</section>
<!-- END section -->


<section class="section-cover" data-stellar-background-ratio="0.5"
         style="background-image: url(${basepath}/static/images/img_5.jpg);">
</section>
<!-- END section -->

<#include "./common/foot.ftl">
<script>
    function subRoomOrder() {
        debugger
        var roomno = $("#roomnoval").val();
        var starttime = $("#starttime").val();
        if (starttime == '') {
            myAlert("开始时间不能为空！", function (f) {
            }, false);
            return false;
        }
        var endtime = $("#endtime").val();
        if (endtime == '') {
            myAlert("结束时间不能为空！", function (f) {
            }, false);
            return false;
        }

        var startTime1 = new Date(starttime).Format("yyyy-MM-dd hh:mm:ss");
        var endTime1 = new Date(endtime).Format("yyyy-MM-dd hh:mm:ss");
        if (startTime1 > endTime1) {
            myAlert("开始日期大于结束日期，请重新选择！", function (f) {
            }, false);
            return;
        }
        var phone = $("#phone").val();
        if (phone == '') {
            myAlert("电话不能为空！", function (f) {
            }, false);
            return false;
        }
        var numcount = $("#numcount").val();
        if (numcount == '') {
            myAlert("房间数量不能为空！", function (f) {
            }, false);
            return false;
        }
        var message = $("#message").val();
        var nickname = $("#nickname").val();
        var username = window.sessionStorage.getItem("username");
        var dataFrom = {
            "roomno": roomno,
            "starttime": starttime,
            "endtime": endtime,
            "nickname": nickname,
            "phone": phone,
            "username": username,
            "numcount": numcount,
            "message": message
        };
        $.ajax({
            type: "post",
            async: false, // 同步请求
            url: ctx + "/order/bookRoom",
            data: dataFrom,
            success: function (data) {
                if (data.code == "200") {
                    myAlert("预定成功！", function (f) {
                    }, false);
                    top.location = ctx + "/order/myorder?username=" + username;
                } else {
                    myAlert("提交失败！", function (f) {
                    }, false);
                }
            },
            error: function () {
            }
        });
    }
</script>
</body>
</html>