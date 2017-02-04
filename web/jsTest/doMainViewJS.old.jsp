<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript">
    /** 访问基本路径 */
    var basePath = "/javaee8_201702/mobileGoods8/";

    //region 页面一加载就要运行的方法
    $(function ()
        {
            //region 初始化显示商品信息的表格
            //ini_showGoodsNameAndType();
            //endregion

            //region 显示所有苹果产品
            showApple();
            //endregion

            //region 实现批量修改
            batchUpdateGoods();
            //endregion
        }
    );
    //endregion

    //region 初始化
    function ini_showGoodsNameAndType()
    {
        $('#showGoodsNameAndType').datagrid
        (
            {
                url: basePath + "ini_tb_goodsNameTypes.com",
                //长
                width: 2000,
                //高
                height: 1000,
                //显示行号
                rownumbers: true,
                //分页
                pagination: true,
                pageList: [500, 600, 1000, 5000],
                //标题
                title: '商品和类别信息',
                columns://
                    [
                        [
                            {field: 'mobileGoodsId', title: '手机商品编号', width: 250},
                            {field: 'mobileGoodsName', title: '手机名称', width: 900},
                            {field: 'mobileGoodsType', title: '手机类型', width: 250}
                        ]
                    ],
                //行条纹化
                striped: true,
                //头部
                showHeader: true,
                //显示底部
                showFooter: true,
                //工具栏
                toolbar: '#tb'
            }
        );
    }
    //endregion

    //region 实现批量修改

    /**
     * 具体思路:
     * 1.首先接收所有行的数据然后接收下拉框中的数据
     * 2.将两个值传入后台进行更新
     */
    function batchUpdateGoods()
    {
        $('#batchUpdateGoods').click(function ()
            {
                //1.首先获取表格中选中的手机主键
                //获取选中行
                getRows = $('#showGoodsNameAndType2').datagrid('getSelections');
                //手机商品编号
                mobileGoodsId = 0;
                for (i = 0; i < getRows.length; i++)
                {
                    mobileGoodsId += getRows[i].mobileGoodsId + ",";
                }
                //获取下拉框中的值(手机类型)
                mobileGoodsType = $('#select_mobileGoodsType').combobox('getText');
                console.log(mobileGoodsType);

                //2.将值传入后台进行更新
                //3.正常情况下, 在修改后应及时更新datagrid, 如果没有重新加载成功则就采用下面一种方法来实现
                //3.更新完成后将更新完成的数据显示在最新的datagrid中(此时就要查询表中所有的数据了)
            }
        );
    }

    //endregion

    //region 测试功能

    //region 显示苹果产品

    function showApple()
    {
        $('#div1').empty();

        $('#showGoodsNameAndType2').datagrid
        (
            {
                url: basePath + "batchShowApple.com",
                //长
                width: 2000,
                //高
                height: 1000,
                //显示行号
                rownumbers: true,
                //分页
                pagination: true,
                pageList: [500, 600, 1000, 5000],
                //标题
                title: '商品和类别信息',
                columns://
                    [
                        [
                            {field: 'mobileGoodsId', title: '手机商品编号', width: 250},
                            {field: 'mobileGoodsName', title: '手机名称', width: 900},
                            {field: 'mobileGoodsType', title: '手机类型', width: 250}
                        ]
                    ],
                //行条纹化
                striped: true,
                //头部
                showHeader: true,
                //显示底部
                showFooter: true,
                toolbar: '#tb2'
            }
        );
    }

    //endregion

    function testFunction()
    {
        $('#search_mobileGoodsStart').click(function ()
            {
                $('#div1').empty();
                var mobileGoodsStart = $('#mobileGoodsStart').val();
                var jspOperator = "searchWhatStart";
                $('#showGoodsNameAndType2').datagrid
                (
                    {
                        url: basePath + "searchGoodsStart.com?mobileGoodsStart=" + mobileGoodsStart +
                        "       &&jspOperator=" + jspOperator,
                        //长
                        width: 2000,
                        //高
                        height: 1000,
                        //显示行号
                        rownumbers: true,
                        //分页
                        pagination: true,
                        pageList: [500, 600, 1000, 5000],
                        //标题
                        title: '商品和类别信息',
                        columns://
                            [
                                [
                                    {field: 'mobileGoodsId', title: '手机商品编号', width: 250},
                                    {field: 'mobileGoodsName', title: '手机名称', width: 900},
                                    {field: 'mobileGoodsType', title: '手机类型', width: 250}
                                ]
                            ],
                        //行条纹化
                        striped: true,
                        //头部
                        showHeader: true,
                        //显示底部
                        showFooter: true
                    }
                );
                /*
                 //商品以什么字符开头
                 var mobileGoodsStart = $('#mobileGoodsStart').val();
                 var jspOperator = "searchWhatStart";
                 if (mobileGoodsStart.length > 0)
                 {
                 $.ajax
                 (
                 {
                 url: basePath + "searchGoodsStart.com?mobileGoodsStart=" + mobileGoodsStart +
                 "       &&jspOperator=" + jspOperator,
                 method: 'POST',
                 success: function (msg)
                 {
                 //刷新表格
                 $('#showGoodsNameAndType').datagrid('reload');
                 }
                 }
                 ); //end ajax
                 }
                 */
            }
        );

        $('#search_mobileGoods_NotStart').click(function ()
            {
                //查询不以什么开头
                //mobileGoods_NotStart
                var mobileGoodsStart = $('mobileGoodsStart').val();
                var jspOperator = "doNotSearchWhatStart";
                if (mobileGoodsStart.length > 0)
                {
                    $.ajax
                    (
                        {
                            url: basePath + "searchGoodsStart.com?mobileGoodsStart=" + mobileGoodsStart +
                            "       &&jspOperator=" + jspOperator,
                            method: 'POST',
                            success: function (msg)
                            {
                                //刷新表格
                                $('#showGoodsNameAndType').datagrid
                                (
                                    {
                                        queryParams://
                                            {
                                                mobileGoodsId: mobileGoodsId,
                                                mobileGoodsName: mobileGoodsName,
                                                mobileGoodsType: mobileGoodsType
                                            }
                                    }
                                );

                                $('#showGoodsNameAndType').datagrid('reload');
                            }
                        }
                    ); //end ajax
                }
            }
        );
    }
    //endregion

</script>


















