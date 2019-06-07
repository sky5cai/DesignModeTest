package observerMode.action;

import observerMode.displayModel.CurrentConditionsDisplay;
import observerMode.displayModel.StatisticsDisplay;
import observerMode.weatherModel.WeatherData;
import org.junit.jupiter.api.Test;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  16:07 2019/6/1
 * @Modified by
 */
public class WeatherStation {
    @Test
    public void testWeatherObserver(){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMessurements(33,44,55);
        weatherData.setMessurements(66,77,88);
    }
}
