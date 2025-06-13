import java.util.Scanner;
public class HelloWorld {
    public static boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
        }
    }
    return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sushant Ambastha: 24SCSE2030113");

        if(args.length==0){
            System.out.println("No command line arguments provided");
        }
        else{
            System.out.println("Command line Arguments");
            for(int i=0; i<args.length; i++){
                System.out.println("Argument" +(i+1)+ ": "+args[i]);
            }
        }
        sc.close();
    }
}