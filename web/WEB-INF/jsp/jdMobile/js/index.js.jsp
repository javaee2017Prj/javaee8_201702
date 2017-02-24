<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript">
    /** html页面测试javascript文件 */
    $(function ()
        {
            //region 定义访问基本路径
            /** 定义访问基本路径 */
            jdBasePath = "/javaee8_201702/jdMobile";
            //endregion

            //region 定义传送到后台的ajax字符串(后面判断条件进行拼接)
            addAjaxURL = jdBasePath + "/searchMobileGoods.com";
            //endregion

            //region 品牌(手机类型)

            //region apple
            $('#img_type_apple').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlMobileType=apple");
                }
            );
            //endregion

            //region huawei
            $('#img_type_huawei').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlMobileType=huawei");
                }
            );
            //endregion

            //region leshi
            $('#img_type_leshi').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlMobileType=leshi");
                }
            );
            //endregion

            //region meizu
            $('#img_type_meizu').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlMobileType=meizu");
                }
            );
            //endregion

            //region oppo
            $('#img_type_oppo').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlMobileType=oppo");
                }
            );
            //endregion

            //region sanxing
            $('#img_type_sanxing').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlMobileType=sanxing");
                }
            );
            //endregion

            //region vivo
            $('#img_type_vivo').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlMobileType=vivo");
                }
            );
            //endregion

            //region xiaomi
            $('#img_type_xiaomi').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlMobileType=xiaomi");
                }
            );
            //endregion

            //endregion

            //region 价格
            //htmlStartPrice
            //htmlEndPrice
            $('#MOBILE_PRICE__BETWEEN_0_499').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlStartPrice=0&&htmlEndPrice=499");
                }
            );

            $('#MOBILE_PRICE__BETWEEN_500_999').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlStartPrice=500&&htmlEndPrice=999");
                }
            );

            $('#MOBILE_PRICE__BETWEEN_1000_1699').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlStartPrice=1000&&htmlEndPrice=1699");
                }
            );

            $('#MOBILE_PRICE__BETWEEN_1700_2799').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlStartPrice=1700&&htmlEndPrice=2799");
                }
            );

            $('#MOBILE_PRICE__BETWEEN_2800_4499').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlStartPrice=2800&&htmlEndPrice=4499");
                }
            );

            $('#MOBILE_PRICE__BETWEEN_4500_11999').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlStartPrice=4500&&htmlEndPrice=11999");
                }
            );

            $('#MOBILE_PRICE__OVER_12000').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlStartPrice=12000");
                }
            );

            //endregion

            //region 运行内存
            //htmlRunMemory
            $('#MOBILE_MEMORY_2G').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlRunMemory=2G");
                }
            );

            $('#MOBILE_MEMORY_3G').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlRunMemory=3G");
                }
            );

            $('#MOBILE_MEMORY_4G').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlRunMemory=4G");
                }
            );

            $('#MOBILE_MEMORY_6G').click(function ()
                {
                    searchAjax(addAjaxURL + "?htmlRunMemory=6G");
                }
            );
            //endregion

            //region 机身内存
            //endregion

            //region 电池容量
            //endregion

            //region 机身颜色
            //endregion

            //region 前置摄像头
            //endregion

            //region 后置摄像头
            //endregion
        }
    );

    //region ajax筛选执行
    function searchAjax(url)
    {
        $.ajax
        (
            {
                url: url,
                method: 'POST',
                success: function (msg)
                {
                }
            }
        );
    }
    //endregion
</script>

<style type="text/css">
    .selectMobile
    {
        border-bottom: 1px solid #DDD;
    }
</style>














