//CLASS
class Student2{  
    String name;
    int age;
    
    //METHOD
        public void getInfo(){
        System.out.println("The name of the student is " + this.name);
        System.out.println("The age of the student is "+this.age);
        }
}
public class OOP {
    public static void main(String[] args) {
        
    
        //OBJ
    Student2 s1 = new Student2(); 
    s1.name="jaisai";
    s1.age=17;
    s1.getInfo();
        //OBJ
    Student2 s2=new Student2();
    s2.name="valasa";
    s2.age=17;
    s2.getInfo();
    }

    
}
