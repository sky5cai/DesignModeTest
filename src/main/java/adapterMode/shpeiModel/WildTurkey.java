package adapterMode.shpeiModel;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  23:41 2019/6/5
 * @Modified by
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("我叫的很大声");

    }

    @Override
    public void fly() {
        System.out.println("我想火箭一样的飞");
    }
}
