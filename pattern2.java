//package patterns;
/*
public class pattern2 {
    
        static void pattern1(int N) {
            for (int i = 0; i < N; i++) {
                // Print N stars in a single line
                for (int j = 0; j <=i; j++) {
                    System.out.print("*");
                }
                // Move to the next line after printing N stars
                System.out.println();
                }    }
        
        
        public static void main(String[] args) {
            int N = 10;
            pattern1(N);
        }
    

    
}
        */
/* o/p
 * 
 * *
 * * *
 * * * *
 * * * * *
 */

 public class pattern2 {
    
    static void pattern1(int N) {
        for (int i = 0; i < N; i++) {
            // Print N stars in a single line
            for (int j = 0; j <=i; j++) {
                System.out.print(i+1);
            }
            // Move to the next line after printing N stars
            System.out.println();
            }    }
    
    
    public static void main(String[] args) {
        int N = 10;
        pattern1(N);
    }
}
    /*
     1
     22
     333
     4444
     55555
     */

     public class pattern2 {
    
        static void pattern2(int N) {
            for (int i = 0; i<=N; i++) {
                // Print N stars in a single line
                for (int j = 0; j<N-i+1 ; j++) {
                    System.out.print(i+1);
                }
                // Move to the next line after printing N stars
                System.out.println();
                }    }
        
        
        public static void main(String[] args) {
            int N = 10;
            pattern2(N);
        }}

