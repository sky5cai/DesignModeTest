package guanchaMode.displayModel;

import guanchaMode.weatherModel.DisplayElement;
import guanchaMode.weatherModel.Observer;
import guanchaMode.weatherModel.Subject;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  15:57 2019/6/1
 * @Modified by
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private float preesure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObServer(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+" % humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.preesure = pressure;
        display();
    }
}