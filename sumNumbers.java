import java.util.Scanner;
public class sumNumbers {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number :");
        int sum = 0;
        for(int i=1;i<=10;i++) {
            sum +=i;
        }
System.out.print("sum: "+sum);
sc.close();

    }

}