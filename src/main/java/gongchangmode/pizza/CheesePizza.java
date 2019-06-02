package gongchangmode.pizza;

import gongchangmode.factory.PizzaIngredientFactory;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  15:27 2019/6/2
 * @Modified by
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("preparing"+name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
