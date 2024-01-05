import java.util.Scanner;
class Number2
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
int i=0;
do
{
System.out.print(i+",");
i++;
}while(i<=n);
}
}