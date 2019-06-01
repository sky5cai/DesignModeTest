package zhuangtaiMode.stateModel;

/**
 * 状态接口
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  17:17 2019/6/1
 * @Modified by
 */
public interface State {
    /**
     * 插入硬币
     */
    void insertQuarter();

    /**
     * 返还硬币
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    void dispense();

}
