import java.util.Scanner;
 class if_else_example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        if(i==0||j==0){
        System.out.println("Division by Error");
        }
        System.out.println(i+"divided by"+i+""+j+"is :"+(i/j));
}
}
