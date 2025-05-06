// Interface example in Java
// This program demonstrates the use of interfaces in Java.


interface shape{
    public void get_data(int x,int y);
    public void display_area();
}

class Reactangle implements shape{
    int length, breadth, area;
    public void get_data(int x, int y){
        length = x;
        breadth = y;
    }
    public void display_area(){
        area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
    }
}

class Square implements shape{
    int length, area;
    public void get_data(int x,int y){
        length = x;
    }
    public void display_area(){
        area = length * length;
        System.out.println("Area of square is: " + area);
    }
}

public class interfaceque{
    public static void main(String args[]){
        Reactangle r = new Reactangle();
        r.get_data(5, 10);
        r.display_area();
        
        Square s = new Square();
        s.get_data(5, 0);
        s.display_area();
    }
}