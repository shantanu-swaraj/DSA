public class fibonacci {
 public static int f(int n){
    if(n <= 1){
        return n;
    }
    int last = f(n-1);
    int slast =f(n-2);

    return last+slast;
    

    //return f(n-1) + f(n-2);
 }   

public static void main(String[] args){
    int n = 4;
    System.out.println("at position "+n+"is: "+f(n));
}
}

/*
public class Fibonacci {
    
    public static int fib(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }
        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Fibonacci number at position " + n + " is: " + fib(n));
    }
}
*/