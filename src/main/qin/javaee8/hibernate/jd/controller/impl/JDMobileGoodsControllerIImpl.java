package qin.javaee8.hibernate.jd.controller.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.javaee8.exceptions.JavaEE8Exception;
import qin.javaee8.hibernate.jd.JDMobileEasyUI;
import qin.javaee8.hibernate.jd.controller.JDMobileGoodsControllerI;
import qin.javaee8.hibernate.jd.controller.JDMobileHTML;
import qin.javaee8.hibernate.jd.domain.JDMobileGoods;
import qin.javaee8.hibernate.jd.service.JDMobileService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping(value = "/jdMobile")
@SuppressWarnings("all")
public class JDMobileGoodsControllerIImpl implements JDMobileGoodsControllerI
{
    private static final long serialVersionUID = -3046432557869945948L;

    //region 注入服务层
    private JDMobileService mobileService;

    public JDMobileService getMobileService()
    {
        return mobileService;
    }

    @Resource
    public void setMobileService(JDMobileService mobileService)
    {
        this.mobileService = mobileService;
    }
    //endregion

    //region 返回京东手机首页

    /**
     * 返回京东手机首页
     *
     * @return
     */
    @RequestMapping(value = "/index")
    @Override
    public ModelAndView index()
    {
        return new ModelAndView(jdMobileBasePath + "/eIndex");
    }
    //endregion

    //region 显示推荐商品

    /**
     * 显示推荐商品(只显示5条)
     *
     * @throws JavaEE8Exception 捕获输出异常
     */
    @RequestMapping(value = "/showRecommandMobileGoods")
    @Override
    public void showRecommandMobileGoods() throws JavaEE8Exception
    {
        //事先定义一些变量
        //想要把手机输入到界面上首先就要查询其中5条记录
        List<JDMobileGoods> mobileGoodsList = new ArrayList<>();

        try
        {
            mobileGoodsList = mobileService.showALLMobileGoods();

            StringBuilder htmlRecommandMobileGoods = new StringBuilder();

            //判断集合中是否有值, 如果有则将其前5条记录输出, 如果没有就输出并无推荐信息
            if (mobileGoodsList.size() >= 0)
            {
                //输出(最多输出3条如果没有5条, 有几条就输出几条)
                for (int i = 1; i <= mobileGoodsList.size(); i++)
                {
                    //只输出3条记录
                    if (i == 3)
                    {
                        break;
                    }
                    //继续输
                }
            }
            else
            {
                //输出并无推荐信息
            }
        }
        catch (Exception ex)
        {
            superInfo_logger_expection("at line 64:public void showRecommandMobileGoods()显示推荐手机信息失败!" + ex);
        }
    }
    //endregion

    //region 显示所有手机信息

    /**
     * 显示所有手机信息
     *
     * @throws JavaEE8Exception
     */
    @Override
    public void showAllMobileGoods() throws JavaEE8Exception
    {
    }
    //endregion

    //region 根据接收的手机条件进行查找

    /**
     * 根据接收的手机条件进行查找
     *
     * @param mobileGoods 手机商品
     * @throws JavaEE8Exception
     */
    @Deprecated
    @RequestMapping(value = "/searchMobileGoods")
    @Override
    public void searchMobileGoods(JDMobileHTML mobileGoods) throws JavaEE8Exception
    {
        System.out.println(mobileGoods.getHtmlMobileType().trim());
        System.out.println(mobileGoods.getHtmlRunMemory().trim());
    }
    //endregion

    //region 根据下拉框选中的值进行查找
    @RequestMapping(value = "/searchMobileGoods_easyui")
    @Override
    public void searchEasyuiMobileGoods(JDMobileEasyUI mobileEasyUI) throws JavaEE8Exception
    {
    }

    //endregion

    //region 新增手机信息

    /**
     * 新增我的手机信息
     *
     * @param mobileEasyUI 界面上的下拉框控件的值(不能改变, 不能new, 也不能改变值)
     * @throws JavaEE8Exception 输出有异常
     */
    @Override
    public void addMobileGoods(JDMobileEasyUI mobileEasyUI) throws JavaEE8Exception
    {

    }

    //endregion
}

/*
class A
{
    String s = "<img src=\"http://localhost/javaee8_2017/logo/apple.jpg\" alt=\"\">";
}*/
