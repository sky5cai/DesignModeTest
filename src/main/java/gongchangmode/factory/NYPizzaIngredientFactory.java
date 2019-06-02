package gongchangmode.factory;

import gongchangmode.model.cheeseModel.Cheese;
import gongchangmode.model.cheeseModel.ReggianoCheese;
import gongchangmode.model.doughModel.Dough;
import gongchangmode.model.doughModel.ThinCrustDough;
import gongchangmode.model.sauceModel.MarinaraSauce;
import gongchangmode.model.sauceModel.Sauce;
import gongchangmode.model.veggiesModel.Garlic;
import gongchangmode.model.veggiesModel.Onion;
import gongchangmode.model.veggiesModel.Veggies;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  15:18 2019/6/2
 * @Modified by
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(),new Onion()};
        return veggies;

    }
}
