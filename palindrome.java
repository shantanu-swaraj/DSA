//reverse a array

    /*
    public class reversearray{
    public static void F(int[] a, int i, int n){
        if(i>=n/2){
            return;
        }
        int temp=a[i];
        a[i]=a[n-i-1];
        a[n-i-1]=temp;
        //Swap(a[i],a[n-i-1]);
        F(a,i+1,n);
    }

    public static void main(String[] args){
        int[] a={0,1,2,3,4,5};
        F(a,0,a.length);
        
for(int num : a){
        System.out.print(num);
    }}
}*/

//palindrome string

public class palindrome{
public static boolean F(int i, String s){
    if(i>=s.length() / 2) {
        return true;
}
if(s.charAt(i) != s.charAt(s.length() - i - 1)){
    return false;
}
return F(i+1,s);
}

public static void main(String[] args){
    String s="Naman";
    boolean result = F(0,s);

    if(result){
        System.out.println(s + " is palindrome");
    }else
    System.out.println(s + " is not palindrome");
    //F(a,0,a.length);
    

}
}
