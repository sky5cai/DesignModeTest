package strategyMode.QuackModel;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  14:21 2019/6/1
 * @Modified by
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("橡皮鸭子吱吱叫");
    }
}
