package zhuangshizheMode.tiaoweiliaoModel;

import zhuangshizheMode.yinliaomodel.Beverage;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  13:34 2019/6/2
 * @Modified by
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" add milk";
    }

    @Override
    public double cose() {
        return beverage.cose()+0.45;
    }
}
