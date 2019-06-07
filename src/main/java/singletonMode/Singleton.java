package singletonMode;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  15:41 2019/6/2
 * @Modified by
 */
public class Singleton {
    //私有静态类
    private static Singleton uniqueSingleton;

    //不给创建
    private Singleton(){}

    //全局获取途径
    public static Singleton getInstance(){
        if(uniqueSingleton==null){
            uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
    }
}
