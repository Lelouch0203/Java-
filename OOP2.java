
class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println("Student name is "+ this.name);
        System.out.println("Student age is "+ this.age);
    }
    
    
   
    Student(Student s2 ){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){

    }

    
}
public class OOP2 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
      s1.name="jaisai";
      s1.age=17;
        Student s2 = new Student(s1);
        s2.printinfo();
    }

    
}
