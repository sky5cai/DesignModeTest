package strategyMode.flyModel;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  14:17 2019/6/1
 * @Modified by
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}
