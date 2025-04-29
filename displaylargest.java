import java.util.Scanner;

 class LargestNumber {
    public static void main(String[] args) {
        int[] num = new int[10];
        int i, largest;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.println("Enter number: ");
            num[i] = sc.nextInt();
        }

        largest = num[0];

        for (i = 1; i < 10; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}