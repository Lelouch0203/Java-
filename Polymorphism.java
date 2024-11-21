class Students{
    String name;
    int age;
    public void displayinfo(String name){
        System.out.println(name);
    }

    public void displayinfo(int age){
        System.out.println(age);
        
    }
    public void displayinfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        
        Students s1 = new Students();
        s1.name= "jaisai";
        s1.displayinfo(s1.name);
    }
    
}