package shipeiqiMode;

import shipeiqiMode.noMalModel.Duck;
import shipeiqiMode.shpeiModel.Turkey;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  23:42 2019/6/5
 * @Modified by
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
