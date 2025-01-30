import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n: ");
        int n = sc.nextInt();
        int i , j;

        for(i=1; i<=n*2-1; i++){
            System.out.print("*"+ " ");
        }
        System.out.println();
        n--;
        for(i=1;i<=n;i++){
            for(j=1;j<=n+1-i;j++){
                System.out.print("*"+" ");
            }
            for(j=1; j<=2*i-1; j++){
                System.out.print(" "+" ");

            }
            for(j=1;j<=n+1-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
      
    }
    
}
