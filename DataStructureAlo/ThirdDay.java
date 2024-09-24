package DataStructureAlo; //- >package

public class ThirdDay {
    int length = 9;

    public ThirdDay(int l) {
        if (l > 0) {
            length = l;
        } else {
            l = 0;
        }

    }

    public void setLength(int l) { // setter
        if (l > 0) {
            length = l;
        } else {
            l = 0;
        }
    }

    public int getLength() { // getter
        return length;
    }

    public static void main(String[] args) {
        ThirdDay chdfhkjds = new ThirdDay(8); // way to create object
        chdfhkjds.setLength(77);

        int result = chdfhkjds.run(3);
        System.out.println(result);
        System.out.println(chdfhkjds.getLength());

    }

    public int run() { // metho
        System.out.println("hello world");
        return -1;
    }

    public int run(int a) { // metho
        System.out.println("hello world 2");
        return length;
    }
}

class xyz {

}

// class

// Abstraction --> internal data hide
// Encapsulation -->
// Inheritence
// POlymorphism

// Constructor non parametrize constructor / default;
// public ThirdDay(){

// }
