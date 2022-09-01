package DesignPattern.Dp01_Singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        // 构造函数私有  不可见
        // SingleObject object = new SingleObject();

        // 获取唯一可用的对象
//        SingleObject object = SingleObject.getInstance();
//        object.showMessage();

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
    }
}
