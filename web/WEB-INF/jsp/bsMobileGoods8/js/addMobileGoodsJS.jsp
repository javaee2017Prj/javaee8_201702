<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- 新增手机商品javascript页面 --%>
<script type="text/javascript">

    addMobileGoodsJSBasePath = "/javaee8_201702/bsMobileGoods8/";

    //region 更新方法:清空div并且重置
    /**
     * 如果下拉框中选择的是其它则将原来下拉框div内容清空重新放一个input text来放一个新的值
     * <br>在html页面用到了
     *
     * @param _selectId 下拉框id值
     * @param _divId div的id值(需要删除内容的div)
     * @param _inputId
     * @param _placeholder 提示信息
     * @private
     */
    function _cleanDivAndAppend(_selectId, _divId, _inputId, _placeholder)
    {
        _mySelectValue = document.getElementById(_selectId).value;
        //_mySelectValue = $('#' + _selectId).val();

        //判断如果选项是其它的话再清空然后赋div
        if (_mySelectValue === '其它')
        {
            //清空div
            $('#' + _divId).empty();
            divCode = " <input type=\"text\" class=\"form-control\" id=\"" + _inputId + "\"\n" +
                "                   placeholder=\"" + _placeholder + "\"/>";
            //赋值div
            $('#' + _divId).append(divCode);
        }
    }
    //endregion

    //region 定义常用变量
    /** 真 */
    _true = true;

    /** 假 */
    _false = false;
    //endregion

    //region 正则表达式
    /** 定义一些正则表达式 */
    MobileRegex =
        {
            /** 检测是否全部是数字(js正则表达式) */
            checkIsAllNumber: new RegExp("^[0-9]*$")
        };
    //endregion

    //region 只有当点击关闭的时候清空异常div
    /** 只有当点击关闭的时候清空异常div, 否则所有的错误信息全部在页面上 */
    function cleanExpDIV()
    {
        $('#addJS_expInfo').empty();
    }
    //endregion

    //region 检测手机工具类
    /** 检测手机工具类 */
    MobileUtils =
        {//
            /**
             * 封装简便方法(输出错误信息并且获取焦点到此控件上)
             *
             * @param expInfo 赋值异常信息
             * @param inputId 输入框主键
             */
            doWrongEvent: function (expInfo, inputId)
            {
                $('#addJS_expInfo').append(expInfo);
                $('#' + inputId).focus();
                $('#myModal').modal('show');
                return;
            },
            /**
             * 检测不为空的字段
             *
             * @param HTMLGoodsNumber 手机编号
             * @param HTMLGoodsName 名称
             * @param HTMLGoodsPrice 价格
             * @param HTMLGoodsOS 系统
             * @param HTMLGoodsMemory 内存
             * @param HTMLGoodsBattery 电池
             * @param HTMLGoodsROM 机身内存
             * @param HTMLGoodsColor 机身颜色
             */
            checkNotNULL: function
                (//
                    HTMLGoodsNumber, HTMLGoodsName, HTMLGoodsPrice,
                    HTMLGoodsOS, HTMLGoodsMemory, HTMLGoodsBattery,
                    HTMLGoodsROM, HTMLGoodsColor//
                )
            {
                //region 商品编号
                if (HTMLGoodsNumber.length === 0)
                {
                    return this.doWrongEvent("手机编号不能为空", "HTMLGoodsNumber");
                }
                //不能大于10个长度
                if (HTMLGoodsNumber.length > 10)
                {
                    return this.doWrongEvent("手机编号不能超过10个字符", "HTMLGoodsNumber");
                }
                //endregion

                //region 名称
                if (HTMLGoodsName.length === 0)
                {
                    return this.doWrongEvent("手机名称不能为空", "HTMLGoodsName");
                }
                //判断手机名称中是否含有<br>如果有则一个个判断商品名称是否大于80个字符
                if (HTMLGoodsName.indexOf("<br>") > 1)
                {
                    //截取
                    splitGoodsName = HTMLGoodsName.split("<br>");
                    //逐个判断
                    for (i = 0; i < splitGoodsName.length; i++)
                    {
                        //名称不能大于80个字
                        if (splitGoodsName[i].length > 80)
                        {
                            return this.doWrongEvent("手机名称不能超过80个字符", "HTMLGoodsName");
                        }
                    }
                }

                //商品名称不能全部为数字
                if (MobileRegex.checkIsAllNumber.test(HTMLGoodsName))
                {
                    return this.doWrongEvent("手机名称不能全部为数字", "HTMLGoodsName");
                }
                //endregion

                //region 价格
                if (HTMLGoodsPrice.length === 0)
                {
                    return this.doWrongEvent("手机价格不能为空", "HTMLGoodsPrice");
                }
                else
                {
                    //如果价格里有.就要判断.前后是否都是数字
                    //JS里是indexOf查找字符串如果查找成功返回1不成功则返回-1
                    //所以步骤就是
                    //先判断接收的字符串里是否含有. 如果有则截取位置并且判断在点前后是否都是数字, 如果不是弹出警告
                    //如果不含.则判断接收的是否都是数字
                    _index = HTMLGoodsPrice.indexOf(".");
                    //含
                    if (_index === 1)
                    {
                        //截取
                        //前面的字符串
                        front = HTMLGoodsPrice.substring(0, _index);
                        //后面的字符串
                        end = HTMLGoodsPrice.substring(_index + 1, HTMLGoodsPrice.length);

                        //判断是否全是数字
                        if (!MobileRegex.checkIsAllNumber.test(front) && MobileRegex.checkIsAllNumber.test(end))
                        {
                            return this.doWrongEvent("手机价格必须全部为数字", "HTMLGoodsPrice");
                        }
                    }
                    else
                    {
                        //那么就是等于-1
                        if (!MobileRegex.checkIsAllNumber.test(HTMLGoodsPrice))
                        {
                            return this.doWrongEvent("手机价格必须全部为数字", "HTMLGoodsPrice");
                        }
                    }
                }
                //endregion

                //region 系统
                if (HTMLGoodsOS.length === 0)
                {
                    return this.doWrongEvent("手机系统不能为空", "HTMLGoodsOS");
                }
                //endregion

                //region 内存
                if (HTMLGoodsMemory.length === 0)
                {
                    return this.doWrongEvent("手机内存不能为空!", "HTMLGoodsMemory");
                }
                //endregion

                //region 电池
                if (HTMLGoodsBattery.length === 0)
                {
                    return this.doWrongEvent("手机电池不能为空", "HTMLGoodsBattery");
                }
                //endregion

                //region 机身内存
                if (HTMLGoodsROM.length === 0)
                {
                    return this.doWrongEvent("手机机身内存不能为空", "HTMLGoodsROM");
                }
                //endregion

                //region 机身颜色
                if (HTMLGoodsColor.length === 0)
                {
                    return this.doWrongEvent("手机机身颜色不能为空", "HTMLGoodsColor");
                }
                //endregion
            },
            checkOthers: function
                (//
                    HTMLGoodsType, HTMLGoodsBackCamera, HTMLGoodsNews,
                    HTMLGoodsFrontCamera//
                )
            {
                //region 商品类型不能为空
                if (HTMLGoodsType.length === 0)
                {
                    return this.doWrongEvent("商品类型不能为空", "HTMLGoodsType");
                }
                //endregion

                //region 新闻不能超过3000个字
                if (HTMLGoodsNews.length > 3000)
                {
                    return this.doWrongEvent("手机热点不能超过3000个字", "HTMLGoodsNews");
                }
                //endregion

                //region 前置摄像头不能超过30个字
                if (HTMLGoodsFrontCamera.length > 30)
                {
                    return this.doWrongEvent("手机前置摄像头不能超过30个字", "HTMLGoodsFrontCamera");
                }
                //endregion

                //region 后置摄像头不能超过50个字
                if (HTMLGoodsBackCamera.length > 50)
                {
                    return this.doWrongEvent("手机后置摄像头不能超过50个字", "HTMLGoodsBackCamera");
                }
                //endregion
            }
        };
    //endregion

    //region 页面一开始就要运行的方法
    $(function ()
        {
            //region 赋值商品类型
            $.ajax
            (
                {
                    url: addMobileGoodsJSBasePath + "getMobileGoodsType.com",
                    method: 'POST',
                    success: function (msg)
                    {
                        $('#HTMLGoodsTypeParent').append(msg);
                        $('#HTMLGoodsType').append(msg);
                    }
                }
            );
            //endregion

            //region 当点击了添加按钮时的方法
            $('#btn_addMobileGoods').click(function ()
                {
                    //1.先判断接收的字段, 有如下字段不能为空:
                    //region 用于接收界面字段
                    HTMLMobileGoods =
                        {
                            //手机编号
                            HTMLGoodsNumber: $('#HTMLGoodsNumber').val(),
                            //名称
                            HTMLGoodsName: $('#HTMLGoodsName').val(),
                            //价格
                            HTMLGoodsPrice: $('#HTMLGoodsPrice').val(),
                            //系统
                            HTMLGoodsOS: $('#HTMLGoodsOS').val(),
                            //内存
                            HTMLGoodsMemory: $('#HTMLGoodsMemory').val(),
                            //电池
                            HTMLGoodsBattery: $('#HTMLGoodsBattery').val(),
                            //机身内存
                            HTMLGoodsROM: $('#HTMLGoodsROM').val(),
                            //机身颜色
                            HTMLGoodsColor: $('#HTMLGoodsColor').val(),
                            //------------------------------------------上述字段不能为空
                            //类型
                            HTMLGoodsType: $('#HTMLGoodsType option:selected')[0].innerHTML,
                            //后置摄像头
                            HTMLGoodsBackCamera: $('#HTMLGoodsBackCamera').val(),
                            //热点
                            HTMLGoodsNews: $('#HTMLGoodsNews').val(),
                            //前置摄像头
                            HTMLGoodsFrontCamera: $('#HTMLGoodsFrontCamera').val(),
                            //商品描述
                            HTMLGoodsDescription: $('#HTMLGoodsDescription').val()
                        };

                    addURL = 'addMobileGoods.com?HTMLGoodsType=' + HTMLMobileGoods.HTMLGoodsType +
                        "       &&HTMLGoodsColor=" + HTMLMobileGoods.HTMLGoodsColor +
                        "       &&HTMLGoodsROM=" + HTMLMobileGoods.HTMLGoodsROM +
                        "       &&HTMLGoodsBattery=" + HTMLMobileGoods.HTMLGoodsBattery +
                        "       &&HTMLGoodsBackCamera=" + HTMLMobileGoods.HTMLGoodsBackCamera +
                        "       &&HTMLGoodsNews=" + HTMLMobileGoods.HTMLGoodsNews +
                        "       &&HTMLGoodsFrontCamera=" + HTMLMobileGoods.HTMLGoodsFrontCamera +
                        "       &&HTMLGoodsMemory=" + HTMLMobileGoods.HTMLGoodsMemory +
                        "       &&HTMLGoodsNumber=" + HTMLMobileGoods.HTMLGoodsNumber +
                        "       &&HTMLGoodsPrice=" + HTMLMobileGoods.HTMLGoodsPrice +
                        "       &&HTMLGoodsName=" + HTMLMobileGoods.HTMLGoodsName +
                        "       &&HTMLGoodsDescription=" + HTMLMobileGoods.HTMLGoodsDescription +
                        "       &&HTMLGoodsOS=" + HTMLMobileGoods.HTMLGoodsOS;

                    //endregion

                    //2.调用方法判断接收的手机控件
                    MobileUtils.checkNotNULL
                    (//
                        HTMLMobileGoods.HTMLGoodsNumber, HTMLMobileGoods.HTMLGoodsName, HTMLMobileGoods.HTMLGoodsPrice,
                        HTMLMobileGoods.HTMLGoodsOS, HTMLMobileGoods.HTMLGoodsMemory,
                        HTMLMobileGoods.HTMLGoodsBattery, HTMLMobileGoods.HTMLGoodsROM, HTMLMobileGoods.HTMLGoodsColor//
                    );
                    MobileUtils.checkOthers
                    (//
                        HTMLMobileGoods.HTMLGoodsType, HTMLMobileGoods.HTMLGoodsBackCamera,
                        HTMLMobileGoods.HTMLGoodsNews, HTMLMobileGoods.HTMLGoodsFrontCamera//
                    );
                    //分为检查不为空和为空字段
                    $.ajax
                    (
                        {
                            url: addURL,
                            method: 'POST',
                            success: function (msg)
                            {
                                alert(msg);
                            }
                        }
                    );
                }
            );
            //endregion

            //region 弹出新增商品类型对话框
            $('#btn_openAddGoodsTypeModal').click(function ()
                {
                    $('#modal_addGoodsType').modal('show');
                }
            );
            //endregion

            //region 添加商品类型
            $('#btn_addGoodsType').click(function ()
                {
                    //首先要验证控件
                    HTMLMobileGoodsType =
                        {
                            //上级
                            HTMLGoodsTypeParent: $('#HTMLGoodsTypeParent option:selected')[0].innerHTML,
                            //名称
                            HTMLGoodsTypeName_: $('#HTMLGoodsTypeName_').val(),
                            //描述
                            HTMLGoodsTypeDescription_: $('#HTMLGoodsTypeDescription_').val(),
                            doCheckType: function ()
                            {
                                //region 名称
                                if (this.HTMLGoodsTypeName_.length === 0)
                                {
                                    alert("手机名称不能为空");
                                    return;
                                    //return MobileUtils.doWrongEvent("手机名称不能为空", "HTMLGoodsTypeName_");
                                }
                                //判断手机名称中是否含有<br>如果有则一个个判断商品名称是否大于80个字符
                                if (this.HTMLGoodsTypeName_.indexOf("<br>") > 1)
                                {
                                    //截取
                                    splitGoodsName = this.HTMLGoodsTypeName_.split("<br>");
                                    //逐个判断
                                    for (i = 0; i < splitGoodsName.length; i++)
                                    {
                                        //名称不能大于80个字
                                        if (splitGoodsName[i].length > 80)
                                        {
                                            alert("手机名称不能超过80个字符");
                                            return;
                                            //return MobileUtils.doWrongEvent("手机名称不能超过80个字符", "HTMLGoodsTypeName_");
                                        }
                                    }
                                }
                                //商品名称不能全部为数字
                                if (MobileRegex.checkIsAllNumber.test(this.HTMLGoodsTypeName_))
                                {
                                    alert("手机名称不能全部为数字");
                                    return;
                                    //return MobileUtils.doWrongEvent("手机名称不能全部为数字", "HTMLGoodsTypeName_");
                                }
                                //endregion
                            }
                        };

                    HTMLMobileGoodsType.doCheckType();

                    addTypeURL = addMobileGoodsJSBasePath +
                        "addGoodsType.com?HTMLGoodsTypeParent=" + HTMLMobileGoodsType.HTMLGoodsTypeParent +
                        "       &&HTMLGoodsTypeName_=" + HTMLMobileGoodsType.HTMLGoodsTypeName_ +
                        "       &&HTMLGoodsTypeDescription_=" + HTMLMobileGoodsType.HTMLGoodsTypeDescription_;

                    //ajax处理
                    $.ajax
                    (
                        {
                            url: addTypeURL,
                            method: 'POST',
                            success: function (msg)
                            {
                                alert(msg);
                            }
                        }
                    )
                }
            );
            //endregion
        }
    );
    //endregion

</script>