package strategyMode.QuackModel;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  14:19 2019/6/1
 * @Modified by
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子在呱呱叫");
    }
}
