class Student {
    String name;
    int age;
    int rollNo;
    Student(String name, int age){
        this.name = name;
        this.age = age;

    }
    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    void show(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollNo);
    }

    public class App{
        public static void main(String args[]) {
            Student a1 = new Student("John", 25);
            Student a2 = new Student("Jane", 22, 101);
            a1.show();
            a2.show();
        }

    }
    
}
