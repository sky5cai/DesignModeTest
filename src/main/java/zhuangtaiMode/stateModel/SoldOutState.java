package zhuangtaiMode.stateModel;

import zhuangtaiMode.controller.GumballMachine;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  17:20 2019/6/1
 * @Modified by
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
