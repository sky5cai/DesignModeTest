package zhuangshizheMode.test;

import org.junit.jupiter.api.Test;
import zhuangshizheMode.tiaoweiliaoModel.Milk;
import zhuangshizheMode.tiaoweiliaoModel.Mocha;
import zhuangshizheMode.yinliaomodel.Beverage;
import zhuangshizheMode.yinliaomodel.Espresso;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  13:35 2019/6/2
 * @Modified by
 */
public class StarbuzzCoffee {

    @Test
    public void test1(){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cose());

        //装饰
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription()+"$"+beverage.cose());
    }
}
