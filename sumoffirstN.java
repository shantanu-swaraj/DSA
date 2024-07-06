//sum of first n numbers

//method 1 := parametrsed way
/*

public class sumoffirstN{
    public static void f(int i,int sum){

    if(i<1){
        System.out.println(sum);
        return;
    }
    f(i-1, sum+i);
    }
public static void main(String[] args){
    int n=3;
    f(n,0);
}
}
*/

//method 2 := functional way   
 /*

public class sumoffirstN{
    // Recursive function to calculate sum
    public static int sum(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive call and return the sum
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println(sum(n));  // Call the recursive function and print the result
    }
}
*/


//factorial 

public class sumoffirstN{
    // Recursive function to calculate sum
    public static int sum(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 1;  // f(0)=1 in case of factoriAL
        }
        // Recursive call and return the sum
        return n * sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 4; // Example input
        System.out.println(sum(n));  // Call the recursive function and print the result
    }
}