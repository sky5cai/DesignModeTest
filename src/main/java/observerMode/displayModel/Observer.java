package observerMode.displayModel;

/**
 * 观察者接口类
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  15:39 2019/6/1
 * @Modified by
 */
public interface Observer {

    public void update(float temp,float humidity,float preesure);
}
