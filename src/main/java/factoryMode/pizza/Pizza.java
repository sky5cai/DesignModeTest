package factoryMode.pizza;

import factoryMode.model.cheeseModel.Cheese;
import factoryMode.model.doughModel.Dough;
import factoryMode.model.sauceModel.Sauce;
import factoryMode.model.veggiesModel.Veggies;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  15:22 2019/6/2
 * @Modified by
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;

    abstract void prepare();

    void bake(){
        System.out.println("bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("please pizza in official PizzaStore box");
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}
