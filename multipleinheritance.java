// WAP to demonstrate multiple inheritance using interfaces
// 2081-01-23
interface A{
    public void greet();
}
interface B{
    public void learn();
}
class C implements A,B{
    public void greet(){
        System.out.println("Hello, welcome to the world of Java!");
    }
    public void learn(){
        System.out.println("Learning multiple inheritance using interfaces.");
    }
}

public class multipleinheritance{
    public static void main(String args[]){
        C obj = new C();
        obj.greet();
        obj.learn();
}
}



