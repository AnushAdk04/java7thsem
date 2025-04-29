import java.util.Scanner;

class matrixdisplay{
    public static void main(String args[]){
        int [][] num = new int [2][2];
        int i,j;
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.println("Enter Elements of Matrix: ");
                Scanner sc = new Scanner(System.in);
                num[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is: ");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}