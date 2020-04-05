package strategyMode.duckModel;

import strategyMode.QuackModel.QuackBehavior;
import strategyMode.flyModel.FlyBehavior;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  14:25 2019/6/1
 * @Modified by
 */
public abstract class Duck {
    //飞行为
    FlyBehavior flyBehavior;
    //叫行为
    QuackBehavior quackBehavior;
    //执行叫
    public void performQuack(){
        quackBehavior.quack();
    }
    //执行飞
    public void performFly(){
        flyBehavior.fly();
    }
    //放飞实现
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    //放叫实现
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("我会游泳");
    }
}
