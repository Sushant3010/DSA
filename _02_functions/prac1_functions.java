import java.util.Scanner;

public class prac1_functions {
    public static int calculateAverage(int a, int b, int c){
        int average = (a+b+c)/3;
        return average;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = calculateAverage(a, b, c);
        System.out.println(average);
    }
    }


