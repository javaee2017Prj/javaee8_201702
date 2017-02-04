<%@ page import="org.hibernate.Session" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="qin.javaee8.hibernate.domain.GoodsType" %>
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
    </div>

    <div id="tb2">
        <select class="easyui-combobox" id="select_mobileGoodsType" style="width:300px;">
            <%
                Session hbSession =
                        (
                                (SessionFactory) new
                                        ClassPathXmlApplicationContext("applicationContext.xml")
                                        .getBean("sessionFactory")
                        ).openSession();
                List<GoodsType> goodsTypes = hbSession
                        .createQuery("from GoodsType ").list();

                int i = 0;

                for (Iterator<GoodsType> it = goodsTypes.iterator(); it.hasNext(); )
                {
                    GoodsType g = it.next();
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

        <a href="#" class="easyui-linkbutton c1" iconCls="icon-edit"
           style="margin-top: 3%;" id="batchUpdateGoods">修改</a>

    </div>

    <div id="finishUpdate" style="margin-top: 3%;">
        <table id="tb_finishUpdate"></table>
    </div>

</div>
</body>

</html>

















