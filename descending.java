import java.util.Scanner;
import java.util.Arrays;

 class DescendingOrder {
    public static void main(String[] args) {
        int[] num = new int[10];
        int i,j,temp;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.println("Enter number: ");
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        System.out.println("The array in descending order is: ");
        for (i = 9; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}