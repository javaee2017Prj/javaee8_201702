<%@ page import="org.hibernate.Session" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="qin.javaee8.hibernate.domain.JDGoodsType" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %><%--
    修改手机商品类型
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改手机商品类型</title>
    <script type="text/javascript" src="http://localhost/jsLib/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="http://localhost/jsLib/easyui/jquery.easyui.min.js"></script>
    <link rel="stylesheet" href="http://localhost/jsLib/easyui/themes/bootstrap/easyui.css">
    <link rel="stylesheet" href="http://localhost/jsLib/easyui/themes/color.css">
    <link rel="stylesheet" href="http://localhost/jsLib/easyui/themes/icon.css">
    <jsp:include page="js/doMainViewJS.jsp"></jsp:include>
</head>

<body class="easyui-layout">

<div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">
    <div id="div1">
        <table id="showGoodsNameAndType"></table>
    </div>

    <div id="div2">
        <table id="showGoodsNameAndType2"></table>
        <div class="tb2">
            <select class="easyui-combobox" style="width:300px;">
                <%
                    Session hbSession =
                            (
                                    (SessionFactory) new
                                            ClassPathXmlApplicationContext("applicationContext.xml")
                                            .getBean("sessionFactory")
                            ).openSession();
                    List<JDGoodsType> goodsTypes = hbSession
                            .createQuery("from JDGoodsType where parentGoodsType.id=149").list();

                    int i = 0;

                    for (Iterator<JDGoodsType> it = goodsTypes.iterator(); it.hasNext(); )
                    {
                        JDGoodsType g = it.next();
                        i++;
                        out.println(new StringBuilder()
                                            .append("<option value='")
                                            .append(i)
                                            .append("'>")
                                            .append(g.getGoods_typeName())
                                            .append("</option>").toString());
                    }
                %>
            </select>
        </div>

    </div>

    <%-- 表格顶部一栏 --%>

    <div id="tb">

        <%-- 临时功能, 今后会完善 --%>
        <%-- <!-- 商品以什么字符开头 -->
         商品以什么字符开头:
         <input type="text" class="easyui-textbox" id="mobileGoodsStart" placeholder="商品以什么字符开头">

         <a href="#" class="easyui-linkbutton c1" id="search_mobileGoodsStart"
            iconCls="icon-search">查询</a>

         <br><br>
         <!--
                查询不以什么开头
                比如说苹果商品类型里面有一个商品叫做
                李宇春
                则此商品并不是苹果类型商品就可以批量删除了
          -->
         查询不以什么开头:
         <a href="#" class="easyui-linkbutton c2" id="search_mobileGoods_NotStart"
            iconCls="icon-search">查询</a>--%>
        <%-- 临时功能, 今后会完善 --%>

        <!-- button -->
        <%--<a href="#" class="easyui-linkbutton c1" onclick="showApple()" iconCls="icon-search">查询苹果产品</a>--%>

        <!-- button -->

    </div>

    <%-- 表格顶部一栏 --%>

</div>
</body>

</html>

















