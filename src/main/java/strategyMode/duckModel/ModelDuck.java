package strategyMode.duckModel;

import strategyMode.QuackModel.MuteQuack;
import strategyMode.QuackModel.Quack;
import strategyMode.flyModel.FlyNoWay;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  14:33 2019/6/1
 * @Modified by
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display(){
        System.out.println("i'm a Model duck");
    }
}
