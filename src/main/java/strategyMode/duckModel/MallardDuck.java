package strategyMode.duckModel;

import strategyMode.QuackModel.Quack;
import strategyMode.flyModel.FlyWithWings;

/**
 * 绿头鸭
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  14:28 2019/6/1
 * @Modified by
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("i'm a real Mallard duck");
    }
}
