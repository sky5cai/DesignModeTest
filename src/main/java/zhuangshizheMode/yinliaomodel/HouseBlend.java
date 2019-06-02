package zhuangshizheMode.yinliaomodel;

/**
 * 首选咖啡(星巴克咖啡名)
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  13:28 2019/6/2
 * @Modified by
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "houseBlend";
    }

    @Override
    public double cose() {
        return .87;
    }
}
