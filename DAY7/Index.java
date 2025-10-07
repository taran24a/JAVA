class Student{
    String name;
    int age;
    
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
    }
    void show(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Index {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20);
        Student s2 = new Student(s1);
        s1.show();
        s2.show();

    }
    
}
