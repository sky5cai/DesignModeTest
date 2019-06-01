package celuemoshi2.QuackModel;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  14:21 2019/6/1
 * @Modified by
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("玩具鸭子不会叫");
    }
}
