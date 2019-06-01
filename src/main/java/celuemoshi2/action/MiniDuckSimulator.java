package celuemoshi2.action;

import celuemoshi2.duckModel.Duck;
import celuemoshi2.duckModel.MallardDuck;
import celuemoshi2.flyModel.FlyRockPowered;
import org.junit.jupiter.api.Test;

/**
 * 场景：游乐园放几种不同的鸭子，玩具鸭，真的鸭子，不会飞的鸭子
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  14:31 2019/6/1
 * @Modified by
 */
public class MiniDuckSimulator {
    /**
     * 普通调用
      */
    @Test
    public void testDuckCelueMode(){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }

    /**
     * 场景：中途更换飞行的模式状态
     */
    @Test
    public void testModifyFlyBehavior(){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        //如果把行为的实现绑死在鸭子类中，可就无法做到这样
        mallard.setFlyBehavior(new FlyRockPowered());
        mallard.performFly();
    }


}
