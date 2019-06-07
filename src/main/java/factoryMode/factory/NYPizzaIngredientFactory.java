package factoryMode.factory;

import factoryMode.model.cheeseModel.Cheese;
import factoryMode.model.cheeseModel.ReggianoCheese;
import factoryMode.model.doughModel.Dough;
import factoryMode.model.doughModel.ThinCrustDough;
import factoryMode.model.sauceModel.MarinaraSauce;
import factoryMode.model.sauceModel.Sauce;
import factoryMode.model.veggiesModel.Garlic;
import factoryMode.model.veggiesModel.Onion;
import factoryMode.model.veggiesModel.Veggies;

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
