class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);    
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name +" "+ age);
    }

    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }
    // Student(Student s2) { // copy constructor
    //     this.name = s2.name;
    //     this.age = s2.age;

    // }
    // Student() {
        
    // }
}

public class Oop {
    public static void main(String args[]) {
        Student s1 = new Student(); //constuctor fun will call here
        s1.name = "Tanavi";
        s1.age = 21;

        s1.printInfo(s1.name, s1.age);
    }
}
