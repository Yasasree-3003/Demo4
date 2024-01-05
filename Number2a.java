import java.util.Scanner;
class Number2a
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
int i=n;
do
{
System.out.print(i+" ");
i=i-5;
}while(i>=0);
}
}