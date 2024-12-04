public class ConstructorOverloading {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("shraddha");// costructor overloading 
        Student s3 = new Student(123);
        System.out.println(s2.name);
        System.out.println(s3.roll);

    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("costructor is called");
    }

    Student(String newname) {
        this.name = newname;

    }

    Student(int roll) {
        this.roll = roll;
    }
}