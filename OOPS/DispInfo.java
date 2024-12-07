import java.util.Scanner;

public class DispInfo {

    public static void main(String[] args) { // jidhr yeh parenthesis () aajye unhe method bolte h
        Student s1 = new Student(); // object is that
        s1.input(); // s1=object so that's called object.method
        s1.disp();
    }
}

class Student {
    String name, city;
    int age, roll;

    void input() { // yeh bhi method hai
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine(); // yeh bhi method hai
        System.out.println("enter city");
        city = sc.nextLine();
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println("enter roll");
        roll = sc.nextInt();

    }

    void disp() {
        System.out.println("these are the informations ");
        System.out.println( name);
        System.out.println( city);
        System.out.println( roll);
        System.out.println( age);
    }

}
