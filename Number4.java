import java.util.Scanner;
class Number4
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
for( int i=0;i<=n;i=i+5)
{
System.out.print(i+" ");
}
}
}