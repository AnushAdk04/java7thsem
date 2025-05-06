// WAP to display interface variable and method in the main class
// 2081-01-23

interface math{
    float kpi = 3.14f;
    void area(float r);
}


public class mymath implements math{
    public void area(float r){
        System.out.println(r * math.kpi);
    }

    public static void main(String args[]){
        float r = 5;
        mymath m = new mymath();
        m.area(r);
    } 
}