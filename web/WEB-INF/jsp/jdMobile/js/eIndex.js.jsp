<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript">
    //region 定义访问基本路径
    /** 定义访问基本路径(全局变量) */
    jdBasePath = "/javaee8_201702/jdMobile";
    //endregion

    $(function ()
        {

            //region 执行查找功能
            $('#a_searchMobile').click(function ()
                {
                    var search_mobileType = $('#search_mobileType').combobox('getText');
                    var search_mobilePrice = $('#search_mobilePrice').combobox('getText');
                    var search_mobileMemory = $('#search_mobileMemory').combobox('getText');
                    var search_mobileROM = $('#search_mobileROM').combobox('getText');
                    var search_mobileBattery = $('#search_mobileBattery').combobox('getText');
                    var search_mobileBackCamera = $('#search_mobileBackCamera').combobox('getText');
                    var search_mobileFrontCamera = $('#search_mobileFrontCamera').combobox('getText');
                    var search_mobileColor = $('#search_mobileColor').combobox('getText');

                    var searchURL = jdBasePath + "/searchMobileGoods_easyui.com?search_mobileType=" + search_mobileType +
                        "       &&search_mobilePrice=" + search_mobilePrice +
                        "       &&search_mobileMemory=" + search_mobileMemory +
                        "       &&search_mobileROM=" + search_mobileROM +
                        "       &&search_mobileBattery=" + search_mobileBattery +
                        "       &&search_mobileBackCamera=" + search_mobileBackCamera +
                        "       &&search_mobileFrontCamera=" + search_mobileFrontCamera +
                        "       &&search_mobileColor=" + search_mobileColor;

                    $.ajax
                    (
                        {
                            url: searchURL,
                            method: 'POST',
                            success: function (msg)
                            {

                            }
                        }
                    )
                }
            );
            //endregion
        }
    );
</script>

<style type="text/css">
    .easyui-combobox
    {
        width: 200px;
    }
</style>