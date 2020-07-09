import java.util.Scanner;
 
public class missingno {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
       long sum =0;
       for(int i =0;i<n-1;i++){
           int a = sc.nextInt();
sum+=a;
       }
       System.out.println((n)*(n+1)/2-sum);
   