public class Factorial {
    public static int factorialofN(int n){
        if(n == 0 || n == 1){
            return 1;
        }
       
    int fact_nm1 = factorialofN(n-1);
    int fact_n = n * fact_nm1;
    return fact_n;
    }
    public static void main(String[] args) {
        int N = 5; 
       int result = factorialofN(N);
       System.out.println(result);
    }
}
