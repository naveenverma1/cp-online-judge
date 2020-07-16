import java.util.*;
public class TestClass {
    public static void main(String args[] ) throws Exception {
       
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t-->0){
  
    String s = sc.next();
String p ="";
    for(int j =s.length()-1;j>=0;j--){
       p+= s.charAt(j);
    }
    String d = "108";
     Set<Character> set  = new HashSet<>();
   for (char c : d.toCharArray()) {
  set.add(c);
}
 
boolean ok = false;
    if(s.equals(p)){
        for(int i =0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                ok= false;
                break;
            }else{
                ok= true;
            }
        }
    }
    if(ok){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
}
    }
}