import java.io.*;
import java.util.*;
public class fibonacci_challenge {
    public static void main(String[] args) throws IOException{
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of terms:");
        int n=s.nextInt();
        int a=0,b=1;
        int c;
        System.out.println(a+"\n"+b);
        for(int i=1;i<=n-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
