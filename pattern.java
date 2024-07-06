public class pattern {
    
        static void pattern1(int N) {
            for (int i = 0; i < N; i++) {
                // Print N stars in a single line
                for (int j = 0; j < N; j++) {
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

    /* o/p
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
