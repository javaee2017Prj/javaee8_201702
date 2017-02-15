package qin.javaee8.hibernate.controller;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.exceptions.LogClassException;
import qin.javaee8.exceptions.LogException;
import qin.javaee8.hibernate.domain.GoodsType;
import qin.javaee8.hibernate.domain.MobileGoods;
import qin.javaee8.hibernate.service.MobileGoodsService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.List;

//@Controller
@Scope("prototype")
@RequestMapping(value = "/mobileGoods8")
@SuppressWarnings("all")
public class MobileGoodsController implements JavaEE8BaseSupport
{
    //region 注入服务层
    private MobileGoodsService mobileGoodsService;

    public MobileGoodsService getMobileGoodsService()
    {
        return mobileGoodsService;
    }

    @Resource
    public void setMobileGoodsService(MobileGoodsService mobileGoodsService)
    {
        this.mobileGoodsService = mobileGoodsService;
    }
    //endregion

        /*

            批量修改商品类型思路:
            首先得定义的几个方法
            1.页面上肯定有手机类型的下拉框, 所以必须在控制层中查询出所有的手机类型并且传值到jsp显示出来
            2.肯定有一个显示商品以及其类型的表格, 这样才会知道这个商品原来是什么类型然后要被改成什么新的类型
            所以第二步做的就是在页面上显示出一个datagrid然后其中有两列
            商品名称以及其类型, 显示所有手机商品和其类型, 并且能够批量修改
            3.接收界面的商品名称然后做相应操作(截取名称)然后更新
        */

    //region doMainView
    @RequestMapping(value = "/doMainView")
    public ModelAndView doMainView()
    {
        return new ModelAndView("/mobileGoods8/doMainView");
    }
    //endregion

    //region 1.显示所有手机商品类型
    @RequestMapping(value = "/showAllMobileTypes")
    public void showAllMobileTypes(HttpServletResponse response) throws JavaEE8Exception
    {

        try
        {
            //查找所有商品类型
            List<GoodsType> goodsTypeList = mobileGoodsService.findAllGoodsTypes();

            //将获取到的商品类型名称写入select下拉框中
            StringBuilder ajaxSelect = new StringBuilder();

            for (Iterator<GoodsType> it = goodsTypeList.iterator(); it.hasNext(); )
            {
                //获取名称
                GoodsType goodsType = it.next();
                ajaxSelect.append("<select>").append(goodsType.getGoods_typeName()).append("</select>");
            }

            //传值到前台
            returnJson(ajaxSelect.toString(), response);
        }
        catch (Exception ex)
        {
            superInfo_logger_expection("<<<<控制层执行查找商品类型出错!>>>>" + ex);
        }
        finally
        {
        }
    }
    //endregion

    //region 2.显示商品名称和商品类型

    /**
     * 显示商品名称和商品类型
     *
     * @param response
     * @throws JavaEE8Exception
     */
    @RequestMapping(value = "/ini_tb_goodsNameTypes")
    public void ini_tb_goodsNameTypes(HttpServletResponse response) throws JavaEE8Exception
    {
        try
        {
            //首先查找所有手机商品
            List<MobileGoods> mobileGoodsList = mobileGoodsService.findAllGoods();
            JSONArray jsonArray = showDataGridData(mobileGoodsList);
            printDataGridInfo(response, mobileGoodsList, jsonArray);
        }
        catch (Exception ex)
        {
            superInfo_logger_expection("<<<<控制层查找手机以及其类型出错!>>>>" + ex);
        }
    }

    //region 将信息输出到easyui中
    private void printDataGridInfo(HttpServletResponse response, List<MobileGoods> mobileGoodsList,
                                   JSONArray jsonArray) throws java.io.IOException
    {
        // 输出基本信息
        String baseStr = "{\"total\":" + mobileGoodsList.size() + ",\"rows\":";
        baseStr = baseStr + jsonArray.toString() + "}";
        returnJson(baseStr, response);
    }
    //endregion

    //region 将表中的数据写入easyui-datagrid

    /**
     * 将表中的数据写入easyui-datagrid
     *
     * @param mobileGoodsList 需要写入的手机商品集合
     * @return 返回JSONArray(java.util.List)
     */
    private JSONArray showDataGridData(List<MobileGoods> mobileGoodsList)
    {
        //迭代集合然后遍历出商品名称以及其类型然后写入JSONObject
        JSONArray jsonArray = new JSONArray();

        JSONObject obj = new JSONObject();

        for (int i = 0; i < mobileGoodsList.size(); i++)
        {
            MobileGoods m = mobileGoodsList.get(i);
            obj.put("mobileGoodsId", m.getId());
            obj.put("mobileGoodsName", m.getGoods_name());
            obj.put("mobileGoodsType", m.getMobileGoodsType().getGoods_typeName());

            jsonArray.add(obj);
        }
        return jsonArray;
    }
    //endregion

    //endregion

    //region 3.实现更新(接收商品名称截取后更新)
    @RequestMapping(value = "/doUpdate")
    public void doUpdate(HttpServletResponse response, HTMLMobileGoods goods) throws JavaEE8Exception
    {
        //商品主键
        String html_mobileGooodsId = "";
        //需要更改的类型(接收下拉框的值[批量修改, 多个商品修改成一种类型])
        String html_mobileGoodsType = "";

        //2.批量修改类型
        try
        {
            html_mobileGooodsId = goods.getHtmlMobileGoodsId().trim();
            html_mobileGoodsType = goods.getHTMLMobileGoodsType().trim();
            //1.首先接收界面的所有商品(界面的商品主键用,分割)
            String[] mobileGoodsIds = html_mobileGoodsType.split(",");
            //2.将值传到服务层进行修改
            String ajaxMsg = mobileGoodsService.batchUpdateGoodsType(mobileGoodsIds, html_mobileGoodsType);
        }
        catch (Exception ex)
        {
            superInfo_logger_expection("<<<<控制层批量修改商品类型失败!>>>>" + ex);
        }
        finally
        {
        }
    }
    //endregion

    //region 测试功能

    //searchGoodsStart, mobileGoodsStart

    /**
     * 查询开始的商品名称哪些包含这两个字的
     *
     * @param response
     * @param goods    从后台接收的商品字段
     */
    @Deprecated
    @RequestMapping(value = "/searchGoodsStart")
    public void searchGoodsStart(HttpServletResponse response, HTMLMobileGoods goods) throws LogClassException, LogException
    {
        try
        {
            //操作
            String jspOperator = goods.getJspOperator().trim();
            String mobileGoodsStart = goods.getMobileGoodsStart().trim();
            //放到数据访问层中去查询(然后写入datagrid)
            List<MobileGoods> mobileGoodsList = mobileGoodsService.search_mobileGoodsStart(mobileGoodsStart, jspOperator);
            JSONArray jsonArray = showDataGridData(mobileGoodsList);
            printDataGridInfo(response, mobileGoodsList, jsonArray);
        }
        catch (Exception ex)
        {
            superInfo_logger_expection("<<<<控制层查找手机以及其类型出错!>>>>" + ex);
        }
    }

    //search_mobileGoods_NotStart, mobileGoods_NotStart
    //endregion

    //region 显示不是苹果的产品
    @RequestMapping(value = "/batchShowApple")
    public void batchShowApple(HttpServletResponse response) throws JavaEE8Exception
    {
        try
        {
            List<MobileGoods> mobileGoodsList = mobileGoodsService.searchAppleInfo();
            JSONArray jsonArray = showDataGridData(mobileGoodsList);
            printDataGridInfo(response, mobileGoodsList, jsonArray);
        }
        catch (Exception ex)
        {
            superInfo_logger_expection("<<<<控制层batchShowApple出错!>>>>" + ex);
        }
    }
    //endregion

}