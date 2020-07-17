// Link : https://codeforces.com/problemset/problem/327/A

import java.util.*;
public class Main {
    public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int a = 0;
  int b =0;
  int c =-1;
  for(int i =0;i<n;i++){
      int j = sc.nextInt();
      if(j==1){
          a++;
          if(b>0) b--;
      }else{
          b++;
          if(b>c) c =b;
      }
  }
  System.out.println(a+c);
    }
}