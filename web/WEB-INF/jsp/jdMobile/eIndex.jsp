<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>京东手机商城首页</title>

    <script type="text/javascript" src="http://localhost/jsLib/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="http://localhost/jsLib/easyui/jquery.easyui.min.js"></script>
    <link rel="stylesheet" href="http://localhost/jsLib/easyui/themes/bootstrap/easyui.css">
    <link rel="stylesheet" href="http://localhost/jsLib/easyui/themes/color.css">
    <link rel="stylesheet" href="http://localhost/jsLib/easyui/themes/icon.css">

    <jsp:include page="js/eIndex.js.jsp"></jsp:include>
</head>
<body class="easyui-layout" style="font-family: 微软雅黑;">
<div data-options="region:'west',title:'导航',split:true" style="width:300px;"></div>
<div data-options="region:'center',title:'主页'" style="padding:5px;background:#eee;">

    <%-- 菜单按钮 --%>
    <div id="div_menubutton">
        <div class="easyui-panel" style="padding:5px;">
            <a href="#" class="easyui-linkbutton" data-options="plain:true">Home</a>
            <a href="#" class="easyui-menubutton" data-options="menu:'#mm1',iconCls:'icon-edit'">Edit</a>
            <a href="#" class="easyui-menubutton" data-options="menu:'#mm2',iconCls:'icon-help'">Help</a>
            <a href="#" class="easyui-menubutton" data-options="menu:'#mm3'">About</a>
        </div>
        <div id="mm1" style="width:150px;">
            <div data-options="iconCls:'icon-undo'">Undo</div>
            <div data-options="iconCls:'icon-redo'">Redo</div>
            <div class="menu-sep"></div>
            <div>Cut</div>
            <div>Copy</div>
            <div>Paste</div>
            <div class="menu-sep"></div>
            <div>
                <span>Toolbar</span>
                <div>
                    <div>Address</div>
                    <div>Link</div>
                    <div>Navigation Toolbar</div>
                    <div>Bookmark Toolbar</div>
                    <div class="menu-sep"></div>
                    <div>New Toolbar...</div>
                </div>
            </div>
            <div data-options="iconCls:'icon-remove'">Delete</div>
            <div>Select All</div>
        </div>
        <div id="mm2" style="width:100px;">
            <div>Help</div>
            <div>Update</div>
            <div>About</div>
        </div>
        <div id="mm3" class="menu-content" style="background:#f0f0f0;padding:10px;text-align:left">
            <img src="http://www.jeasyui.com/images/logo1.png" style="width:150px;height:50px">
            <p style="font-size:14px;color:#444;">Try jQuery EasyUI to build your modern, interactive, javascript applications.</p>
        </div>
    </div>
    <%-- 菜单按钮 --%>

    <%-- 搜索 --%>
    <div>
        <div id="div_searchMobileGoods">

            <br>

            <%-- 手机类型 --%>
            手机类型:
            <select class="easyui-combobox" name="search_mobileType" id="search_mobileType">
                <option>苹果</option>
                <option>华为</option>
                <option>乐视</option>
                <option>魅族</option>
                <option>oppo</option>
                <option>三星</option>
                <option>vivo</option>
                <option>小米</option>
            </select>

            <%-- 价格 --%>
            &nbsp;&nbsp;
            手机价格:
            <select class="easyui-combobox" name="search_mobilePrice" id="search_mobilePrice">
                <option>0-499</option>
                <option>500-999</option>
                <option>1000-1699</option>
                <option>1700-2799</option>
                <option>2800-4499</option>
                <option>4500-11999</option>
                <option>>12000</option>
            </select>

            <%-- 运行内存 --%>
            &nbsp;&nbsp;
            运行内存:
            <select class="easyui-combobox" name="search_mobileMemory" id="search_mobileMemory">
                <option>2G</option>
                <option>3G</option>
                <option>5G</option>
                <option>6G</option>
            </select>

            <%-- 机身内存 --%>
            &nbsp;&nbsp;
            机身内存:
            <select class="easyui-combobox" name="search_mobileROM" id="search_mobileROM">
                <option>8G</option>
                <option>16G</option>
                <option>32G</option>
                <option>64G</option>
                <option>128G</option>
                <option>无</option>
            </select>

            <%-- 电池容量 --%>
            &nbsp;&nbsp;
            电池容量:
            <select class="easyui-combobox" name="search_mobileBattery" id="search_mobileBattery">
                <option>1200mAh以下</option>
                <option>1200mAh-1999mAh</option>
                <option>2000mAh-2999mAh</option>
                <option>3000mAh-3999mAh</option>
                <option>4000mAh-5999mAh</option>
                <option>6000mAh以上</option>
            </select>

            <%-- 第二行div开始 --%>
            <div style="margin-top: 10px;">
                <%-- 后置摄像头 --%>
                后置摄像头:
                <select class="easyui-combobox" name="search_mobileBackCamera" id="search_mobileBackCamera">
                    <option>2000万以上</option>
                    <option>1200万-1999万</option>
                    <option>500万-1199万</option>
                </select>

                <%-- 前置摄像头 --%>
                &nbsp;&nbsp;
                前置摄像头:
                <select class="easyui-combobox" name="search_mobileFrontCamera" id="search_mobileFrontCamera">
                    <option>1600万以上</option>
                    <option>800万-1599万</option>
                    <option>500万-799万</option>
                    <option>200万-499万</option>
                    <option>120万-199万</option>
                    <option>120万以下</option>
                </select>

                <%-- 机身颜色 --%>
                &nbsp;&nbsp;
                机身颜色:
                <select class="easyui-combobox" name="search_mobileColor" id="search_mobileColor">
                    <option>白色</option>
                    <option>黑色</option>
                    <option>灰色</option>
                    <option>金色</option>
                    <option>银色</option>
                    <option>红色</option>
                    <option>粉色</option>
                </select>
            </div>
            &nbsp;&nbsp;
            <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width:200px; margin-top: 10px;" id="a_searchMobile">查找</a>
            <%-- 第二行div结束 --%>
        </div>
    </div>
    <%-- 搜索 --%>

</div>
</body>
</html>





















