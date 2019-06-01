<script>
    var tokenName = window.sessionStorage.getItem("username");
</script>
<header role="banner">
    <nav class="navbar navbar-expand-md navbar-dark bg-light">
        <div class="container">
            <a class="navbar-brand" href="index.html">玮琪酒店</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample05"
                    aria-controls="navbarsExample05" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse navbar-light" id="navbarsExample05">
                <ul class="navbar-nav ml-auto pl-lg-5 pl-0">
                    <li class="nav-item">
                        <a class="nav-link active" href="${basepath}/hms/index">首页</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${basepath}/hms/rooms">房间选择</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" onclick="myorder()"> 我的订单</a>
                    </li>
                    <li class="nav-item cta" id="showorbu">
                        <a class="nav-link" href="${basepath}/login/"><span>登陆 | 注册</span></a>
                    </li>
                    <li class="nav-item active" id="showorbu2">
                        <a class="nav-link"><span id="usernamevalll"></span></a>
                    </li>
                    <li class="nav-item cta" id="showorbu3">
                        <a class="nav-link"><span id="showorbu4">退出</span></a>
                    </li>
                </ul>

            </div>
        </div>
    </nav>
</header>