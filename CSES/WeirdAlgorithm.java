import java.util.*;
 class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        System.out.print(t+" ");
        while(t!=1){
if(t%2==0){
t/=2;
System.out.print(t+" ");
}else if(t%2!=0){
    t= (t*3)+1;
    System.out.print(t+" ");
}
        }
 
        
        sc.close();
    
}
}