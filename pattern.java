// // A star Bridge pattern
// // * * * * * * * * *
// // * * * *   * * * *
// // * * *       * * *
// // * *           * *
// // *                *
// import java.util.Scanner;

// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Value of n: ");
//         int n = sc.nextInt();
//         int i , j;

//         for(i=1; i<=n*2-1; i++){
//             System.out.print("*"+ " ");
//         }
//         System.out.println();
//         n--;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n+1-i;j++){
//                 System.out.print("*"+" ");
//             }
//             for(j=1; j<=2*i-1; j++){
//                 System.out.print(" "+" ");

//             }
//             for(j=1;j<=n+1-i;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//         sc.close();
      
//     }
    
// }

// //  Number Bridge pattern
// * * * * * * * * *
// * * * *   * * * *
// * * *       * * *
// * *           * *
// *                *
/* 
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n: ");
        int n = sc.nextInt();
        int i , j;
       

        for(i=1; i<=n*2-1; i++){
            System.out.print(i+ " ");
        }
        System.out.println();
        n--;
        for(i=1;i<=n;i++){
            int a = 1;
            for(j=1;j<=n+1-i;j++){
                System.out.print(a++ +" ");
            }
            for(j=1; j<=2*i-1; j++){
                System.out.print(" "+" ");
                a++; //very importent

            }
            for(j=5;j<=n+5-i;j++){
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
        sc.close();
      
    }
    
}
*/    


// Print The given patten
//       *
//     * * * 
//   * * * * *
// * * * * * * *
//   * * * * *
//     * * * 
//       *

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n: ");
        int n = sc.nextInt();
        int i , j;
        int nsp = n-1;  //no of spaces
        int nst = 1;    //no of spaces
        for(i=1;i<=n;i++){
            int a = 1;
            for(j=1;j<=nsp;j++){
                System.out.print(" " +" ");
            }
            for(j=1; j<=nst; j++){
                System.out.print("*"+" ");
               
            }   
            nsp--;
            nst+=2; 
            System.out.println();
        }
        // 2nd phase
        nsp = 1;  //no of spaces
        nst = nst-4;    //no of spaces
        for(i=1;i<=n;i++){
            int a = 1;
            for(j=1;j<=nsp;j++){
                System.out.print(" " +" ");
            }
            for(j=1; j<=nst; j++){
                System.out.print("*"+" ");
               
            }   
            nsp++;
            nst-=2; 
            System.out.println();
        }
        sc.close();
      
    }
    
}

 