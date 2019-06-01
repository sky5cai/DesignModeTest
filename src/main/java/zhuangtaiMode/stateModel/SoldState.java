package zhuangtaiMode.stateModel;

import zhuangtaiMode.controller.GumballMachine;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  17:20 2019/6/1
 * @Modified by
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry,you already turned the crack");
    }

    @Override
    public void turnCrank() {
        System.out.println("turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("Oops, out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
