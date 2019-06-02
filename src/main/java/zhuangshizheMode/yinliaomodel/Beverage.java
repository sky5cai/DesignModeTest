package zhuangshizheMode.yinliaomodel;

/**
 * 饮料类
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  13:22 2019/6/2
 * @Modified by
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 花费
     * @return
     */
    public abstract double cose();
}
