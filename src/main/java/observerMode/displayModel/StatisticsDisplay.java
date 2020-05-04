package observerMode.displayModel;

import observerMode.weatherModel.Subject;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  15:57 2019/6/1
 * @Modified by
 * StatisticsDisplay显示的是跟踪最小、平均、最大的观测值，并显示他们
 */
public class StatisticsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private float preesure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObServer(this);
    }

    @Override
    public void display() {
        System.out.println("temperature is "+temperature+" and humidity is "+humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.preesure = pressure;
        display();
    }
}
