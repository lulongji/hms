$(function () {
    $('#login').click(function () {
        var accountId = $("#username").val().replace(/\s+/g, "");
        var password = $("#userpwd").val().replace(/\s+/g, "");
        if (accountId == '') {
            myAlert("登陆失败，账号为空！", function (f) {
            }, false);
            return false;
        }
        if (password == '') {
            myAlert("登陆失败，密码为空！", function (f) {
            }, false);
            return false;
        }
        var dataFrom = {
            "username": accountId,
            "password": password
        };
        setTimeout(function () {
            login(dataFrom);
        }, 1000);

    });

});


// 登录验证
function login(dataFrom) {
    $.ajax({
        type: "post",
        async: false, // 同步请求
        url: ctx + "/login/loginVerify",
        data: dataFrom,
        success: function (data) {
            if (data.code == "200") {
                console.log(data.code + "-" + data.info);
                window.sessionStorage.setItem("username", dataFrom.username);
                top.location = ctx + "/hms/index";
            } else {
                myAlert("登陆失败，账号或密码错误！", function (f) {
                }, false);
                console.log(data.code + "-" + data.info);
                return false;
            }
        },
        error: function () {
            alert("请求失败，网络错误，请稍后再试！");
        }
    });
}