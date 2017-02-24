<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <!-- jquery2.2.4 -->
    <script type="text/javascript" src="http://localhost/jsLib/jQuery/jquery-2.2.4/jquery.js"></script>
    <!-- jquery2.2.4 -->

    <!-- bootstrap3 -->
    <script type="text/javascript" src="http://localhost/jsLib/bootstrap3/js/bootstrap.js"></script>
    <link rel="stylesheet" href="http://localhost/jsLib/bootstrap3/css/bootstrap.css">
    <!-- bootstrap3 -->

    <jsp:include page="js/index.js.jsp"></jsp:include>

</head>

<body style="font-family: 微软雅黑;">

<!-- 手机推荐div -->
<div id="div_mobileRecommand">
    <div class="container" style="width: 90%; background-color: #974676;">
        <div style="color: white; font-family: 微软雅黑; font-size: 26px; font-weight: bold;">
            推荐手机信息
        </div>
    </div>

    <br>

    <div class="container" style="width:90%;background-color: rgb(241, 241, 241); ">
        <div class="row clearfix">

            <!-- 推荐信息 -->
            <div class="col-md-12 column">
                <table>
                    <tr>
                        <td>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">
                                        <img src="http://localhost/javaee8_2017/mobileImages/apple/1.jpg" alt="" id="img_apple">
                                        &nbsp;
                                        <img src="http://localhost/javaee8_2017/mobileImages/apple/2.jpg" alt="" id="img_apple2">
                                    </h3>
                                </div>
                                <div class="panel-body">
                                    <div style="text-align: center;">
                                        <img src="http://localhost/javaee8_2017/addToShop.jpg" alt="" id="addAppleToShop">
                                    </div>
                                </div>
                            </div>
                        </td>
                        <td>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">
                                        <img src="http://localhost/javaee8_2017/mobileImages/oppo/1.jpg" alt="" id="img_oppo1">
                                        &nbsp;
                                        <img src="http://localhost/javaee8_2017/mobileImages/oppo/4.jpg" alt="" id="img_oppo2">
                                    </h3>
                                </div>
                                <div class="panel-body">
                                    <div style="text-align: center;">
                                        <img src="http://localhost/javaee8_2017/addToShop.jpg" alt="" id="addOppoToShop">
                                    </div>
                                </div>
                            </div>
                        </td>
                        <td>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">
                                        <img src="http://localhost/javaee8_2017/mobileImages/letv/1.jpg" alt="" id="img_letv">
                                        &nbsp;
                                    </h3>
                                </div>
                                <div class="panel-body">
                                    <div style="text-align: center;">
                                        <img src="http://localhost/javaee8_2017/addToShop.jpg" alt="" id="addLetvToShop">
                                    </div>
                                </div>
                            </div>
                        </td>
                    </tr>
                </table>
            </div>
            <!-- 推荐信息 -->
        </div>
    </div>
</div>
<!-- 手机推荐div -->

<!-- 查找手机信息 -->

<div id="div_searchMobileGoods">

    <style type="text/css">
        a
        {
            color: brown;
        }

        a:hover
        {
            color: black;
            font-weight: bold;
            font-size: 36px;
        }
    </style>

    <div class="container" style="width: 90%;">
        <div class="row clearfix">
            <div class="col-md-12 column">

                <font style="font-size: 26px; font-weight: bold; color: black;">手机>></font>
                <font style="font-size: 16px; color: rebeccapurple;">上级分类</font>

                <!-- 显示共有多少个手机商品信息 -->
                <div style="background-color: #F1F1F1; font-size: 20px;">

                    <font style="color: red;">手机</font>
                    <font style="font-weight: bold; color: brown;">商品筛选</font>
                    &nbsp;&nbsp;共n个商品

                </div>
                <!-- 显示共有多少个手机商品信息 -->

                <!-- 开始筛选 -->

                <!-- 品牌 -->
                <table class="selectMobile">
                    <tr>
                        <td>
                            品牌:
                            <script type="text/javascript">
                                for (i = 0; i < 30; i++)
                                {
                                    document.write("&nbsp;");
                                }
                            </script>
                        </td>
                        <td>
                            <img src="http://localhost/javaee8_2017/logo/apple.jpg" alt="" id="img_type_apple">
                            <img src="http://localhost/javaee8_2017/logo/huawei.jpg" alt="" id="img_type_huawei">
                            <img src="http://localhost/javaee8_2017/logo/leshi.jpg" alt="" id="img_type_leshi">
                            <img src="http://localhost/javaee8_2017/logo/meizu.jpg" alt="" id="img_type_meizu">
                            <img src="http://localhost/javaee8_2017/logo/oppo.jpg" alt="" id="img_type_oppo">
                            <img src="http://localhost/javaee8_2017/logo/sanxing.jpg" alt="" id="img_type_sanxing">
                            <img src="http://localhost/javaee8_2017/logo/vivo.jpg" alt="" id="img_type_vivo">
                            <img src="http://localhost/javaee8_2017/logo/xiaomi.jpg" alt="" id="img_type_xiaomi">

                            <script type="text/javascript">
                                for (i = 0; i < 42; i++)
                                {
                                    document.write("　");
                                }
                            </script>

                        </td>
                    </tr>
                </table>
                <!-- 品牌 -->

                <!-- 价格 -->
                <table class="selectMobile" style="margin-top: 3px;">
                    <tr>
                        <td>
                            价格:　　
                            <script type="text/javascript">
                                for (i = 0; i < 30; i++)
                                {
                                    document.write("&nbsp;");
                                }
                            </script>
                        </td>
                        <td>
                            <a id="MOBILE_PRICE__BETWEEN_0_499">0-499</a>
                            　　　　　　<a id="MOBILE_PRICE__BETWEEN_500_999">500-999</a>
                            　　　　　　<a id="MOBILE_PRICE__BETWEEN_1000_1699">1000-1699</a>
                            　　　　　　<a id="MOBILE_PRICE__BETWEEN_1700_2799">1700-2799</a>
                            　　　　　　<a id="MOBILE_PRICE__BETWEEN_2800_4499">2800-4499</a>
                            　　　　　　<a id="MOBILE_PRICE__BETWEEN_4500_11999">4500-11999</a>
                            　　　　　　<a id="MOBILE_PRICE__OVER_12000">12000以上</a>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="text" id="htmlStartPrice" placeholder="起始价格">
                            -
                            <input type="text" id="htmlEndPrice" placeholder="最高价格">
                            &nbsp;
                            <button type="button" class="btn btn-success" id="btn_sureMobilePrice">确定</button>
                        </td>
                    </tr>
                </table>
                <!-- 价格 -->

                <!-- 内存 -->
                <table class="selectMobile" style="margin-top: 3px;">
                    <tr>
                        <td>
                            运行内存:
                            <script type="text/javascript">
                                for (i = 0; i < 30; i++)
                                {
                                    document.write("&nbsp;");
                                }
                            </script>
                        </td>
                        <td>
                            <a id="MOBILE_MEMORY_2G">2G</a>
                            　　　　　　<a id="MOBILE_MEMORY_3G">3G</a>
                            　　　　　　<a id="MOBILE_MEMORY_4G">4G</a>
                            　　　　　　<a id="MOBILE_MEMORY_6G">6G</a>
                            <script type="text/javascript">
                                for (i = 0; i < 75; i++)
                                {
                                    document.write("　");
                                }
                            </script>
                        </td>
                    </tr>
                </table>
                <!-- 内存 -->

                <!-- 机身内存 -->
                <table class="selectMobile" style="margin-top: 3px;">
                    <tr>
                        <td>
                            机身内存:
                            <script type="text/javascript">
                                for (i = 0; i < 30; i++)
                                {
                                    document.write("&nbsp;");
                                }
                            </script>
                        </td>
                        <td>
                            <a id="MOBILE_ROM_8">8G</a>
                            　　　　　　<a id="MOBILE_ROM_16">16G</a>
                            　　　　　　<a id="MOBILE_ROM_32">32G</a>
                            　　　　　　<a id="MOBILE_ROM_64">64G</a>
                            　　　　　　<a id="MOBILE_ROM_128">128G</a>
                            　　　　　　<a id="MOBILE_ROM_NO">无</a>
                            <script type="text/javascript">
                                for (i = 0; i < 57; i++)
                                {
                                    document.write("　");
                                }
                            </script>
                        </td>
                    </tr>
                </table>
                <!-- 机身内存 -->

                <!-- 电池容量 -->
                <table class="selectMobile" style="margin-top: 3px;">
                    <tr>
                        <td>
                            电池容量:
                            <script type="text/javascript">
                                for (i = 0; i < 30; i++)
                                {
                                    document.write("&nbsp;");
                                }
                            </script>
                        </td>
                        <td>
                            <a id="MOBILE_BATTERY_LOWER1200">1200mAh以下</a>
                            　　　　　　<a id="MOBILE_BATTERY_BETWEEN_1200_1999">1200mAh以下</a>
                            　　　　　　<a id="MOBILE_BATTERY_BETWEEN_2000_2999">1200mAh-1999mAh</a>
                            　　　　　　<a id="MOBILE_BATTERY_BETWEEN_3000_3999">3000mAh-3999mAh</a>
                            　　　　　　<a id="MOBILE_BATTERY_BETWEEN_4000_5999">4000mAh-5999mAh</a>
                            　　　　　　<a id="MOBILE_BATTERY_HIGHER_6000">6000mAh及以上</a>
                            <script type="text/javascript">
                                for (i = 0; i < 19; i++)
                                {
                                    document.write("　");
                                }
                            </script>
                        </td>
                    </tr>
                </table>
                <!-- 电池容量 -->

                <!-- 机身颜色 -->
                <table class="selectMobile" style="margin-top: 3px;">
                    <tr>
                        <td>
                            机身颜色:
                            <script type="text/javascript">
                                for (i = 0; i < 30; i++)
                                {
                                    document.write("&nbsp;");
                                }
                            </script>
                        </td>
                        <td>
                            <a id="MOBILE_COLOR_WHITE">白色</a>
                            　　　　　　<a id="MOBILE_COLOR_BLACK">黑色</a>
                            　　　　　　<a id="MOBILE_COLOR_GRAY">灰色</a>
                            　　　　　　<a id="MOBILE_COLOR_GOLD">金色</a>
                            　　　　　　<a id="MOBILE_COLOR_SILVIER">银色</a>
                            　　　　　　<a id="MOBILE_COLOR_RED">红色</a>
                            　　　　　　<a id="MOBILE_COLOR_PINK">粉色</a>
                            <script type="text/javascript">
                                for (i = 0; i < 45; i++)
                                {
                                    document.write("　");
                                }
                            </script>
                        </td>
                    </tr>
                </table>
                <!-- 机身颜色 -->

                <!-- 前置摄像头 -->
                <table class="selectMobile" style="margin-top: 3px;">
                    <tr>
                        <td>
                            前置摄像头:
                            <script type="text/javascript">
                                for (i = 0; i < 30; i++)
                                {
                                    document.write("&nbsp;");
                                }
                            </script>
                        </td>
                        <td>
                            <a id="MOBILE_FRONT_CAMERA_HIGHER1600">1600万及以上</a>
                            　　　　　　<a id="MOBILE_FRONT_CAMERA_BETWEEN_800_1599">800万-1599万</a>
                            　　　　　　<a id="MOBILE_FRONT_CAMERA_BETWEEN_500_799">500万-799万</a>
                            　　　　　　<a id="MOBILE_FRONT_CAMERA_BETWEEN_200_499">200万-499万</a>
                            　　　　　　<a id="MOBILE_FRONT_CAMERA_BETWEEN_120_199">120万-199万</a>
                            　　　　　　<a id="MOBILE_FRONT_CAMERA_BELOW_120">120万以下</a>
                            <script type="text/javascript">
                                for (i = 0; i < 30; i++)
                                {
                                    document.write("　");
                                }
                            </script>
                        </td>
                    </tr>
                </table>
                <!-- 前置摄像头 -->

                <!-- 后置摄像头 -->
                <table class="selectMobile" style="margin-top: 3px;">
                    <tr>
                        <td>
                            后置摄像头:
                            <script type="text/javascript">
                                for (i = 0; i < 30; i++)
                                {
                                    document.write("&nbsp;");
                                }
                            </script>
                        </td>
                        <td>
                            <a id="MOBILE_BACK_CAMERA_HIGHER_2000">2000万及以上</a>
                            　　　　　　<a id="MOBILE_BACK_CAMERA_BETWEEN_1200_1999">1200万-1999万</a>
                            　　　　　　<a id="MOBILE_BACK_CAMERA_BETWEEN_500_1199">500万-1199万</a>
                            <script type="text/javascript">
                                for (i = 0; i < 60; i++)
                                {
                                    document.write("　");
                                }
                            </script>
                        </td>
                    </tr>
                </table>
                <!-- 后置摄像头 -->

            </div>
        </div>
    </div>

</div>

<!-- 查找手机信息 -->

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

</body>
</html>


















