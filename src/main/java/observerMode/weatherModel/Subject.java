package observerMode.weatherModel;

import observerMode.displayModel.Observer;

/**
 * 管理类
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
