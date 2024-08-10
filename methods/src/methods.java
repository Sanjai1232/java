
public class methods{
    public static void main(String[] args) {
        add();
        addd(10,10);
    }
    //without arguments
    public static void add() {
        int a=10;
        int b=20;
        System.out.println(a+b);
        System.out.println("above output is without arruguments");

    }
    //with arguments
    public static void addd(int a,int b){
        System.out.println(a+b);
        System.out.println("above output is with aruments");

    }
}