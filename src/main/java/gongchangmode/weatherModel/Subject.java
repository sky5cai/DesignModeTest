package gongchangmode.weatherModel;

/**
 * 管理
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  15:36 2019/6/1
 * @Modified by
 */
public interface Subject {
    public void registerObServer(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
