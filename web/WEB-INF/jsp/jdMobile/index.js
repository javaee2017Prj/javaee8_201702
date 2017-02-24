/** html页面测试javascript文件 */
$(function ()
    {
        /*
         check = document.all || document.getElementById;

         div = {};
         img = {};
         a = {};

         if (check)
         {
         div = document.getElementsByTagName("div");
         img = document.getElementsByTagName("img");
         a = document.getElementsByTagName("a");
         }

         console.log("div ids:=================================");
         for (i = 0; i < div.length; i++)
         {
         console.log(div[i].id);
         }

         console.log("img ids:=================================");
         for (i = 0; i < img.length; i++)
         {
         console.log(img[i].id);
         }

         console.log("a ids:=================================");
         for (i = 0; i < a.length; i++)
         {
         console.log(a[i].id);
         }
         */

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
        //endregion

        //region 运行内存
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

















