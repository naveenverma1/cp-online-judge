/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
*/
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
           arr[i] = sc.nextInt();
 
        }
Stack<Integer> stack = new Stack();
int sum =0;
for(int i =0;i<n;i++){
if(arr[i]==0&& !stack.isEmpty()){
    sum-=stack.pop();
}else if(arr[i]>0){
    sum+=arr[i];
    stack.add(arr[i]);
}
}
System.out.println(sum);
 
 
 
    }
}