package DataStructureAlo;

public class fourthDay {
    int length;
    // Methode overrride
    // Mehod overloading --> same name , same structre

    public void print() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        fourthDay obDay = new fourthDay(); // parent hello world
        obDay.print();

        abc obDay2 = new abc(); // child hello wordl
        obDay2.print();

        fourthDay obDay1 = new abc(); // Dynamic Method Dispatch

    }
}

class abc extends fourthDay {
    int length;

    /*
     * child class
     * partent -> child then it will Inheriate all the method all properties
     */
    @Override
    public void print() { //
        System.out.println("hello prince");
    }

}
