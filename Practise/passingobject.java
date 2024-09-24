public class passingobject {
    public static void main(String [] args){
        int a[] = {1,2,3,4,5};
        System.out.println("From the main method");
        for(int x:a){
            System.out.println(x);
        }
        int [] b = update(a);
        for (int e:b){
            System.out.println(e);
        }
    }
    static int[] update(int a[]){
        System.out.println("From the module methods");
        a[0]=25;
        for (int y:a){
            System.out.println(y);
        }
        return a;
    }
}
