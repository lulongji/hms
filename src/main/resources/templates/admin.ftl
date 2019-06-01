<#assign basepath=request.contextPath />
<!DOCTYPE html>
<html lang="">
<head>
    <meta charset="utf-8">
    <title>Retina Dashboard</title>
    <meta name="description" content=""/>
    <meta name="keywords" content=""/>
    <meta name="robots" content=""/>
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" href="${basepath}/static/admin/css/style.css" media="all"/>
    <!--[if IE]>
    <link rel="stylesheet" href="${basepath}/static/admin/css/ie.css" media="all"/><![endif]-->
</head>
<body>
<div class="testing">
    <header class="main">
        <h1><strong>酒店管理系统</strong></h1>
        <input type="text" value="search"/>
    </header>
    <section class="user">
        <div class="profile-img">
            <p><img src="${basepath}/static/admin/images/uiface2.png" alt="" height="40" width="40"/>admin 欢迎您</p>
        </div>
        <div class="buttons">
            <button class="ico-font">&#9206;</button>
		</span>
            <span class="button blue"><a href="index.html">退出</a></span>
        </div>
    </section>
</div>
<nav>
    <ul>
        <li><a href="dashboard.html"><span class="icon">&#128711;</span> Dashboard</a></li>
        <li class="section">
            <a href="pages-table.html"><span class="icon">&#128196;</span> Pages</a>
            <ul class="submenu">
                <li><a href="page-new.html">Create page</a></li>
                <li><a href="page-timeline.html">View pages</a></li>
            </ul>
        </li>
        <li>
            <a href="files.html"><span class="icon">&#127748;</span> Media <span class="pip">7</span></a>
            <ul class="submenu">
                <li><a href="files-upload.html">Upload file</a></li>
                <li><a href="files.html">View files</a></li>
            </ul>
        </li>
        <li>
            <a href="blog-timeline.html"><span class="icon">&#59160;</span> Blog <span class="pip">12</span></a>
            <ul class="submenu">
                <li><a href="blog-new.html">New post</a></li>
                <li><a href="blog-table.html">All posts</a></li>
                <li><a href="comments-timeline.html">View comments</a></li>
            </ul>
        </li>
        <li><a href="statistics.html"><span class="icon">&#128202;</span> Statistics</a></li>
        <li><a href="users.html"><span class="icon">&#128101;</span> Users <span class="pip">3</span></a></li>
        <li>
            <a href="ui-elements.html"><span class="icon">&#9881;</span> UI Elements</a>
            <ul class="submenu">
                <li><a href="icon-fonts.html">Icon fonts</a></li>
            </ul>
        </li>
    </ul>
</nav>
<section class="alert">
    <div class="green">
        <p>Hi Lee, you have <a href="#">3 new pages</a> and <a href="#">16 comments</a> to approve, better get going!
        </p>
        <span class="close">&#10006;</span>
    </div>
</section>
<section class="content">

</section>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
<script src="${basepath}/static/admin/js/jquery.wysiwyg.js"></script>
<script src="${basepath}/static/admin/js/custom.js"></script>
<script src="${basepath}/static/admin/js/cycle.js"></script>
<script src="${basepath}/static/admin/js/jquery.checkbox.min.js"></script>
<!--<script src="js/flot.js"></script>
<script src="js/flot.resize.js"></script>
<script src="js/flot-graphs.js"></script>
<script src="js/flot-time.js"></script>
<script src="js/cycle.js"></script>-->
<script src="${basepath}/static/admin/js/jquery.tablesorter.min.js"></script>
</body>
</html>