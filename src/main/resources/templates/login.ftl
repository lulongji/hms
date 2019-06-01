<#assign basepath=request.contextPath />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>登陆</title>
    <link href="${basepath}/static/css/style_log.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="${basepath}/static/css/style1.css">
    <link rel="stylesheet" type="text/css" href="${basepath}/static/css/userpanel.css">
    <script src="${basepath}/static/js/jquery-1.9.1.min.js"></script>
    <script src="${basepath}/static/js/llj.js"></script>
    <script src="${basepath}/static/js/login.js"></script>
    <script>var ctx = "${basepath}";</script>

</head>

<body class="login" mycollectionplug="bind">
<div class="login_m">
    <div class="login_boder">

        <div class="login_padding" id="login_model">

            <h2>用户名</h2>
            <label>
                <input type="text" id="username" class="txt_input txt_input2"
                       onfocus="if (value ==&#39;请输入用户名&#39;){value =&#39;&#39;}"
                       onblur="if (value ==&#39;&#39;){value=&#39;Your name&#39;}" value="">
            </label>
            <h2>密码</h2>
            <label>
                <input type="password" name="textfield2" id="userpwd" class="txt_input"
                       onfocus="if (value ==&#39;************&#39;){value =&#39;&#39;}"
                       onblur="if (value ==&#39;&#39;){value=&#39;************&#39;}" value="">
            </label>


            <div class="rem_sub">
                <div class="rem_sub_l">
                    <a href=""><label>在线注册</label></a>
                </div>
                <label>
                    <input type="submit" class="sub_button" name="button" id="login" value="登陆"
                           style="opacity: 0.7;">
                </label>
            </div>
        </div>

    </div><!--login_boder end-->
</div><!--login_m end-->

</body>
</html>

