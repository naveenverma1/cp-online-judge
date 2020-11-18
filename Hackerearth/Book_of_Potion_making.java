import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
  Scanner s = new Scanner(System.in);
  char ch[]=s.nextLine().toCharArray();
  int sum=0;
  for(int i=0;i<ch.length;i++){
      if(i>10){
          break;
      }
      sum=sum+(i+1)*Integer.parseInt(String.valueOf(ch[i]));
  }
  if(sum%11==0){
 System.out.println("Legal ISBN");
  }
  else{
 
System.out.println("Illegal ISBN");

  }
  
    }
}
