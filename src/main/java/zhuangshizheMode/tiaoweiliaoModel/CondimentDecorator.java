package zhuangshizheMode.tiaoweiliaoModel;

import zhuangshizheMode.yinliaomodel.Beverage;

/**
 * 调味料抽象类
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  13:27 2019/6/2
 * @Modified by
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
