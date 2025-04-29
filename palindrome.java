import java.util.Scanner;
class palindrome{
    public static void main(String[]  args){
        int i,n,c=0,r,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        int temp = n;
        while(n>0){
            r = n%10;
            rev = rev*10+r;
            n = n/10;
        }
        if(temp==rev){
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }
    }
}