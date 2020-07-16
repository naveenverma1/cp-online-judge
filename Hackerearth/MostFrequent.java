import java.util.*;
import java.io.*;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
       
  Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int max=0,count=0,index=0;
       int a[]=new int [n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(a[i]==a[j]){
                   count++;
               }
               if(count>max){
                   max=count;
                   index=i;
               }
           }
           count=0;
       }
       System.out.println(a[index]);
    }
    }
    