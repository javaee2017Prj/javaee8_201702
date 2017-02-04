<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript">
    /** 访问基本路径 */
    var basePath = "/javaee8_201702/mobileGoods8/";

    //region 页面一加载就要运行的方法
    $(function ()
        {
            //region 显示所有苹果产品
            showApple();
            //endregion

            //region 实现批量修改
            batchUpdateGoods();
            //endregion
        }
    );
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

</script>