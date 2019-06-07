package factoryMode.pizza;

import factoryMode.factory.PizzaIngredientFactory;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  15:31 2019/6/2
 * @Modified by
 */
public class ClamPizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }


    @Override
    void prepare() {
        System.out.println("Preparing"+name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
//        cheese = pizzaIngredientFactory.createClam();

    }
}
