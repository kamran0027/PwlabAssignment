
class student{
    String name="kamran ahmad";
    String branch="computer Science";
    int age=20;
    void display(){
        System.out.println("name:"+name);
        System.out.println("branch:"+branch);
        System.out.println("age:"+age);
    }

}
public class objectAndclass {
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }

}
