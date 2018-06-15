<!DOCTYPE html>
<html>
<head>
    <meta charset=" utf-8">
    <meta name="author" content="//www.jb51.net/" />
    <title>CSS如何实现弹出一个全屏灰黑色透明遮罩效果-脚本之家</title>
    <style type="text/css">
        *
        {
            margin:0px;
            padding:0px;
        }
        .zhezhao
        {
            width:100%;
            height:100%;
            background-color:#000;
            filter:alpha(opacity=50);
            -moz-opacity:0.5;
            opacity:0.5;
            position:absolute;
            left:0px;
            top:0px;
            display:none;
            z-index:1000;
        }
        .login
        {
            width:280px;
            height:180px;
            position:absolute;
            top:200px;
            left:50%;
            margin-left:-140px;
            display:none;
            z-index:1500;
        }
        .content
        {
            margin-top:50px;
            color:red;
            line-height:200px;
            height:200px;
            text-align:center;
        }
    </style>
    <script type="text/javascript">
        window.onload=function()
        {
            var zhezhao=document.getElementById("zhezhao");
            var login=document.getElementById("login");
            var bt=document.getElementById("bt");
            var btclose=document.getElementById("btclose");

            bt.onclick=function()
            {
                zhezhao.style.display="block";
                login.style.display="block";
            }
            btclose.onclick=function()
            {
                zhezhao.style.display="none";
                login.style.display="none";
            }
        }
    </script>
</head>
<body>
<div class="zhezhao" id="zhezhao">

</div>
<div class="login" id="login">
    <div>
        <form>
            <input type="text"  />
        </form>
    </div>
    <button id="btclose">提交表单</button>
</div>

<div class="content">脚本之家欢迎您，<button id="bt">点击弹出遮罩</button></div>
</body>
</html>