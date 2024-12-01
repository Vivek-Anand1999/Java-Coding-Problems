package Moolya;

public class SingletonClass {
    private static SingletonClass SingletonClass = null;

    private SingletonClass(){}
    static public  SingletonClass getInstance(){
        if(SingletonClass == null){
            SingletonClass = new SingletonClass();
        }
        return SingletonClass;
    }

    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        System.out.println(singletonClass);
        System.out.println(singletonClass1);
    }
    // 102102188390
}
