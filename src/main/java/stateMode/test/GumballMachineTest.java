package stateMode.test;

import org.junit.Test;
import stateMode.controller.GumballMachine;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  17:51 2019/6/1
 * @Modified by
 */
public class GumballMachineTest {

    @Test
    public void test1(){
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        System.out.println(gumballMachine);
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}
