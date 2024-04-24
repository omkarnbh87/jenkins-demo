import java.util.Date;

class Main{
    public static void main(String args[]){
        System.out.println("Main class main method invoked");
        System.out.println(new Date());
        Student student = new Student();
        student.sayHello();
    }
}