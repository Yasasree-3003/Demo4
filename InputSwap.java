import java.util.Scanner;
class InputSwap
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int num1,num2;
num1=s1.nextInt();
num2=s1.nextInt();
int temp;
temp=num1;
num1=num2;
num2=temp;
System.out.println(num1+"\n"+num2);
}
}