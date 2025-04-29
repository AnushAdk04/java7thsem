// wap to store 10 numbers in an array then display those numbers.
import java.util.Scanner;

public class arraydisplay{
    public static void main(String args[]){
        int [] num = new int[10];
        int i;
        for(i = 0; i < 10; i++){
            System.out.println("Enter number: ");
            Scanner sc = new Scanner(System.in);
            num[i] = sc.nextInt();
        }
        System.out.println("The numbers are: ");
        for(i = 0; i < 10; i++){
            System.out.println(num[i]);
        }
    }
} 