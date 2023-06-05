import java.util.Scanner;
public class power {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int base;
int power;
int result=1;
System.out.print("Enter A Number :");
base=sc.nextInt();
System.out.print("Enter A power :");
power=sc.nextInt();
for(int i=1;i<=power;i++){
   result *=base;}
System.out.println("result :"+ result);
  }
}