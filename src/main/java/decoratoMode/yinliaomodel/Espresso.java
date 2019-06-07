package decoratoMode.yinliaomodel;

/**
 * 浓咖啡
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  13:25 2019/6/2
 * @Modified by
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "espresso";
    }

    @Override
    public double cose() {
        return 1.99;
    }
}
