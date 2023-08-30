public class methodOverloading {
    public static void display(int a){
        System.out.println("argument are:"+a);

    }
    public static void display(int a,int b){
        System.out.println("argument are:"+a+" "+b);

    }
    public static void display(int a,int b,int c){
        System.out.println("argument are:"+a+" "+b+" "+c);

    }

    public static void main(String[] args) {
        display(5);
        display(5,7);
        display(5,9,76);
    }
}
