package zhuangshizheMode.tiaoweiliaoModel;

import zhuangshizheMode.yinliaomodel.Beverage;

/**
 * 摩卡配料
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  13:30 2019/6/2
 * @Modified by
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage ;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" add Mocha";
    }

    @Override
    public double cose() {
        return beverage.cose()+0.3;
    }
}
