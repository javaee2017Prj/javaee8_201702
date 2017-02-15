<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<%
    Session hbSession =
            (
                    (SessionFactory) new
                            ClassPathXmlApplicationContext("applicationContext.xml")
                            .getBean("sessionFactory")
            ).openSession();
    List<String> goodsTypeList = hbSession
            .createQuery("select goods_typeName from GoodsType")
            .list();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < goodsTypeList.size(); i++)
    {
        sb.append("<option>" + goodsTypeList.get(i) + "</option>");
    }

    hbSession.close();
%>--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>新增手机商品信息</title>

    <!-- jquery2.2.4 -->
    <script type="text/javascript" src="http://localhost/jsLib/jQuery/jquery-2.2.4/jquery.js"></script>
    <!-- jquery2.2.4 -->

    <!-- bootstrap4 -->
    <script type="text/javascript" src="http://localhost/jsLib/bootstrap3/js/bootstrap.js"></script>
    <link rel="stylesheet" href="http://localhost/jsLib/bootstrap3/css/bootstrap.css">
    <!-- bootstrap4 -->

    <jsp:include page="css/addMobileGoodsCSS.jsp"></jsp:include>
    <jsp:include page="js/addMobileGoodsJS.jsp"></jsp:include>

</head>

<body style="font-family: 微软雅黑; width: 100%;">

<br><br>

<!-- 错误信息 -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel">
                    <div style="font-family: 微软雅黑; font-size: 36px; font-weight: bold; color: firebrick;">
                        您的异常信息:
                    </div>
                </h4>
            </div>
            <div class="modal-body" id="addJS_expInfo"
                 style="font-family: 微软雅黑; font-size: 16px; color: red;"></div>
            <div class="modal-footer">
                <!--<button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>-->
                <button type="button" class="btn btn-danger" data-dismiss="modal" onclick="cleanExpDIV()">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>
<!-- 错误信息 -->

<!--
    添加手机页面必须有如下控件:
    1.要确定它的上级类型
    2.实体类里字段(名称, 描述)
-->
<!-- 对话框 -->

<!-- 对话框(新增手机类型) -->

<div class="modal fade" id="modal_addGoodsType" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">

    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title">
                    <div style="font-family: 微软雅黑; font-size: 36px; font-weight: bold; color: firebrick;">
                        新增手机分类
                    </div>
                </h4>
            </div>
            <div class="modal-body" style="font-family: 微软雅黑; font-size: 16px; color: red;">

                <!-- 表单存放 -->
                <form class="form-horizontal" role="form" id="frm_addGoodsType">
                    <!-- 确定上级 -->
                    <!-- 手机类型 -->
                    <div class="form-group">
                        <label class="col-sm-2 control-label">上级手机类型</label>
                        <div class="col-sm-9">
                            <select class="input-large form-control" id="HTMLGoodsTypeParent">
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">商品类型名称</label>
                        <div class="col-sm-9">
                            <textarea class="form-control" rows="5" id="HTMLGoodsTypeName_"></textarea>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">商品类型描述</label>
                        <div class="col-sm-9">
                            <textarea class="form-control" rows="5" id="HTMLGoodsTypeDescription_"></textarea>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-sm-9">
                            <button type="button" style="margin-top: 2%;" class="btn btn-primary" id="btn_addGoodsType">确定添加</button>
                        </div>
                    </div>
                    <!-- 手机类型 -->
                </form>
                <!-- 表单存放 -->

            </div>
            <div class="modal-footer">
                <!--<button type="button" class="btn btn-danger" data-dismiss="modal">关闭</button>-->
                <button type="button" class="btn btn-danger" data-dismiss="modal" onclick="cleanExpDIV()">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>

<!-- 对话框 -->

<form class="form-horizontal" role="form" id="frm_addMobileGoods">
    <!-- 手机类型 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">手机类型</label>
        <div class="col-sm-9">
            <select class="input-large form-control" id="HTMLGoodsType">
            </select>

            <button type="button" style="margin-top: 2%;" class="btn btn-primary" id="btn_openAddGoodsTypeModal">添加分类</button>
        </div>
    </div>
    <!-- 手机类型 -->

    <!-- 机身颜色 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">机身颜色</label>
        <div class="col-sm-9" id="div_mobileColor">
            <select class="input-large form-control" id="HTMLGoodsColor"
                    onchange="_cleanDivAndAppend('HTMLGoodsColor', 'div_mobileColor', 'HTMLGoodsColor', '机身颜色')">
                <option value="">请选择</option>
                <option>白色</option>
                <option>黑色</option>
                <option>灰色</option>
                <option>金色</option>
                <option>银色</option>
                <option>红色</option>
                <option>粉色</option>
                <option>其它</option>
            </select>
        </div>
    </div>
    <!-- 机身颜色 -->

    <!-- 机身内存 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">机身内存</label>
        <div class="col-sm-9" id="div_mobileROM">
            <select class="input-large form-control" id="HTMLGoodsROM"
                    onchange="_cleanDivAndAppend('HTMLGoodsROM', 'div_mobileROM', 'HTMLGoodsROM', '机身内存')">
                <option value="">请选择</option>
                <option>8G</option>
                <option>16G</option>
                <option>32G</option>
                <option>64G</option>
                <option>128G</option>
                <option>无</option>
                <option>其它</option>
            </select>
        </div>
    </div>
    <!-- 机身内存 -->

    <!-- 手机电池 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">手机电池</label>
        <div class="col-sm-9" id="div_mobileBattery">
            <select class="input-large form-control" id="HTMLGoodsBattery"
                    onchange="_cleanDivAndAppend('HTMLGoodsBattery', 'div_mobileBattery', 'HTMLGoodsBattery', '手机电池')">
                <option value="">请选择</option>
                <option>1200mAh以下</option>
                <option>1200mAh-1999mAh</option>
                <option>2000mAh-2999mAh</option>
                <option>3000mAh-3999mAh</option>
                <option>4000mAh-5999mAh</option>
                <option>6000mAh及以上</option>
                <option>其它</option>
            </select>
        </div>
    </div>
    <!-- 手机电池 -->

    <!-- 后置摄像头 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">后置摄像头</label>
        <div class="col-sm-9" id="div_mobileBackCamera">
            <select class="input-large form-control" id="HTMLGoodsBackCamera"
                    onchange="_cleanDivAndAppend('HTMLGoodsBackCamera','div_mobileBackCamera', 'HTMLGoodsBackCamera', '后置摄像头' )">
                <option value="">请选择</option>
                <option>2000万及以上</option>
                <option>1200万-1999万</option>
                <option>500万-1199万</option>
                <option>其它</option>
            </select>
        </div>
    </div>
    <!-- 后置摄像头 -->

    <!-- 手机资讯 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">手机资讯</label>
        <div class="col-sm-9">
            <textarea class="form-control" rows="40" id="HTMLGoodsNews"></textarea>
        </div>
    </div>
    <!-- 手机资讯 -->

    <!-- 前置摄像头 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">前置摄像头</label>
        <div class="col-sm-9" id="div_frontCamera">
            <select class="input-large form-control" id="HTMLGoodsFrontCamera"
                    onchange="_cleanDivAndAppend('HTMLGoodsFrontCamera','div_frontCamera', 'HTMLGoodsFrontCamera', '前置摄像头' )">
                <option value="">请选择</option>
                <option>1600万及以上</option>
                <option>800万-1599万</option>
                <option>500万-799万</option>
                <option>200万-499万</option>
                <option>120万-199万</option>
                <option>120万以下</option>
                <option>其它</option>
            </select>
        </div>
    </div>
    <!-- 前置摄像头 -->

    <!-- 手机内存 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">手机内存</label>
        <div class="col-sm-9">
            <input type="text" class="form-control" id="HTMLGoodsMemory"
                   placeholder="结尾必须是G"/>
        </div>
    </div>
    <!-- 手机内存 -->

    <!-- 商品编号 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">手机编号</label>
        <div class="col-sm-9">
            <input type="text" class="form-control" id="HTMLGoodsNumber" placeholder="手机编号, 必须全部是数字"/>
        </div>
    </div>
    <!-- 商品编号 -->

    <!-- 商品价格 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">手机价格</label>
        <div class="col-sm-9">
            <input type="text" class="form-control" id="HTMLGoodsPrice"
                   placeholder="手机价格"/>
        </div>
    </div>
    <!-- 商品价格 -->

    <!-- 商品名称 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">手机名称</label>
        <div class="col-sm-9">
            <!--<input type="text" class="form-control" id="HTMLGoodsName"
                   placeholder="手机名称"/>-->
            <textarea class="form-control" rows="40" id="HTMLGoodsName"
                      placeholder="手机名称(多个用<br>分割)"></textarea>
        </div>
    </div>
    <!-- 商品名称 -->

    <!-- 商品描述 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">手机描述</label>
        <div class="col-sm-9">
            <input type="text" class="form-control" id="HTMLGoodsDescription"
                   placeholder="手机描述"/>
        </div>
    </div>
    <!-- 商品描述 -->

    <!-- 手机系统 -->
    <div class="form-group">
        <label class="col-sm-2 control-label">手机系统</label>
        <div class="col-sm-9">
            <select class="input-large form-control" id="HTMLGoodsOS">
                <option value="">请选择</option>
                <option>Android</option>
                <option>Apple</option>
            </select>
        </div>
    </div>

    <!-- 手机系统 -->

    <!-- 添加按钮 -->
    <div class="form-group">
        <label class="col-sm-2 control-label"></label>
        <div class="col-sm-9">
            <button class="btn btn-primary" type="button"
                    style="width: 90%;" id="btn_addMobileGoods">添加
            </button>
        </div>
    </div>
    <!-- 添加按钮 -->
</form>

<br><br><br><br>
<br><br><br><br>
<br><br><br><br>
<br><br><br><br>

</body>
</html>


