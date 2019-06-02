package gongchangmode.factory;

import gongchangmode.model.cheeseModel.Cheese;
import gongchangmode.model.doughModel.Dough;
import gongchangmode.model.sauceModel.Sauce;
import gongchangmode.model.veggiesModel.Veggies;

/**
 * 工厂
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  15:01 2019/6/2
 * @Modified by
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();

}
