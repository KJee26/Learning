package DesignPattern.Dp01_Singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton () {}

    /**
     * 懒汉式，线程不安全
     */
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//            System.out.println("创建单例对象!");
//        }
//        return instance;
//    }

    /**
     * 懒汉式，线程安全
     * 优点：第一次调用才初始化，避免内存浪费。
     * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
     */
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    /**
     * 饿汉式
     * 优点：没加锁，执行效率高
     * 缺点：类加载时初始化，浪费内存
     */
//    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    /**
     * 双检锁
     */
    private volatile static Singleton singleton;

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
