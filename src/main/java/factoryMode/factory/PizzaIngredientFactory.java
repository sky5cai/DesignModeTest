package factoryMode.factory;

import factoryMode.model.cheeseModel.Cheese;
import factoryMode.model.doughModel.Dough;
import factoryMode.model.sauceModel.Sauce;
import factoryMode.model.veggiesModel.Veggies;

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
