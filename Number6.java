import java.util.Scanner;
class Number6
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
for( int i=n;i>=0;i=i-5)
{
System.out.print(i+" ");
}
}
}