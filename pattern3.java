/* 
public class pattern3 {
    static void pattern1(int N) {
        for (int i = 0; i < N; i++) {
            // Print N stars in a single line
            for (int j = 0; j <N-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<2*i+1; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing N stars
            for (int j = 0; j <N-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
            }    }
    
    
    public static void main(String[] args) {
        int N = 10;
        pattern1(N);
    }
}

*/
//o/p
/*
     *
   * * *
 * * * * *
 */

 

 public class pattern3 {
    static void pattern1(int N) {
        for (int i = 0; i < N; i++) {
            // Print N stars in a single line
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<2*N-(2*i +1); j++) {
                System.out.print("*");
            }
            // Move to the next line after printing N stars
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
            }    }
    
    
    public static void main(String[] args) {
        int N = 10;
        pattern1(N);
    }
}