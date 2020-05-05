package adapterMode;

import adapterMode.noMalModel.Duck;
import adapterMode.noMalModel.MallardDuck;
import adapterMode.shpeiModel.WildTurkey;

public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says...");
        testDuck(duck);

        System.out.println("The turkeyAdapter says...");
        testDuck(turkeyAdapter);


    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
