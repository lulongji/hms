<#assign basepath=request.contextPath />
<script>var ctx = "${basepath}";</script>
<footer class="site-footer">
    <div class="container">
        <div class="row mb-5">
            <div class="col-md-4">
                <h3>联系电话</h3>
                <p>24/7 小时.</p>
            </div>
            <div class="col-md-4">
                <h3>关于我们</h3>
                <p>酒店行业领跑者。</p>
            </div>
            <div class="col-md-4">
                <h3>加盟我们</h3>
                <p>玮琪酒店诚邀您的加盟。</p>
            </div>
        </div>
        <div class="row justify-content-center">
            <div class="col-md-7 text-center">
                &copy;
                Copyright &copy;<script>document.write(new Date().getFullYear());</script>
                All rights reserved | by ZHAOWEIQI

            </div>
        </div>
    </div>
</footer>
<!-- END footer -->

<!-- loader -->
<div id="loader" class="show fullscreen">
    <svg class="circular" width="48px" height="48px">
        <circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/>
        <circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10"
                stroke="#f4b214"/>
    </svg>
</div>

<script src="${basepath}/static/js/jquery-3.2.1.min.js"></script>
<script src="${basepath}/static/js/jquery-migrate-3.0.0.js"></script>
<script src="${basepath}/static/js/popper.min.js"></script>
<script src="${basepath}/static/js/bootstrap.min.js"></script>
<script src="${basepath}/static/js/owl.carousel.min.js"></script>
<script src="${basepath}/static/js/jquery.waypoints.min.js"></script>
<script src="${basepath}/static/js/jquery.stellar.min.js"></script>

<script src="${basepath}/static/js/jquery.magnific-popup.min.js"></script>
<script src="${basepath}/static/js/magnific-popup-options.js"></script>

<script src="${basepath}/static/js/main.js"></script>
<script>
    ;$(function () {
        var storage = window.sessionStorage;
        var usernameVal = storage.getItem("username");
        debugger
        if (null == usernameVal || undefined == usernameVal || "" == usernameVal) {
            $("#showorbu").show();
            $("#showorbu2").hide();
            $("#showorbu3").hide();
        } else {
            $("#showorbu").hide();
            $("#showorbu2").show();
            $("#showorbu3").show();
            $("#usernamevalll").html(" 欢迎您:" + usernameVal)
        }

        $('#showorbu4').click(function () {
            window.sessionStorage.removeItem("username");
            debugger
            $.ajax({
                type: "post",
                async: false, // 同步请求
                url: ctx + "/login/logout",
                data: {},
                success: function (data) {
                    top.location = ctx + "/hms/index";
                },
                error: function () {
                    top.location = ctx + "/hms/index";
                }
            });
        });

    });
</script>