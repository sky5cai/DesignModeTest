package zhuangtaiMode.controller;

import zhuangtaiMode.stateModel.*;

/**
 * 糖果机器
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  17:24 2019/6/1
 * @Modified by
 */
public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;

    int count = 0;

    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count=numberGumballs;
        if(numberGumballs>0){
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
    }



    public void setState(State state){
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the solt...");
        if(count!=0){
            count = count -1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                ", state=" + state +
                ", count=" + count +
                '}';
    }
}
