package strategyMode.flyModel;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  14:35 2019/6/1
 * @Modified by
 */
public class FlyRockPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我飞的像火箭那么快");
    }
}
