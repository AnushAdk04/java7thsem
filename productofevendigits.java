import java.util.Scanner;
class evenproduct{
    public static void main(String[] args){
        int n, r, product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        int temp=n;
        while(n > 0){
            r = n % 10;--
            
            if(r % 2 == 0){
                product *= r;
            }
            n = n / 10;
        }
        System.out.println("The product of even digits " + temp + " is: " + product);
    }
}