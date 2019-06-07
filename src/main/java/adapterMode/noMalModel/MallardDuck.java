package adapterMode.noMalModel;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  23:36 2019/6/5
 * @Modified by
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("i am flying");
    }
}
