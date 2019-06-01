package celuemoshi2.duckModel;

import celuemoshi2.QuackModel.QuackBehavior;
import celuemoshi2.flyModel.FlyBehavior;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  14:25 2019/6/1
 * @Modified by
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("我会游泳");
    }
}
