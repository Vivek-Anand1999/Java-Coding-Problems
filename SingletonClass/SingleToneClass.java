package SingletonClass;

public class SingleToneClass {
    private static SingleToneClass singletoneclass = null; // ! -> single object Creation
    private int length;

    private SingleToneClass(int length) { // ! --> constructor
        this.length = length;
    }

    public static SingleToneClass getInstance(int length) {
        if (singletoneclass == null) {
            return singletoneclass = new SingleToneClass(length);
        } else {
            return singletoneclass;
        }
    }

    public static void main(String[] args) {
        SingleToneClass result = SingleToneClass.getInstance(8);
        System.out.println(result.length);

    }
}
