import java.util.Scanner;
class Pattern1
{
public static void printPattern(char c,int n)
{
for(int i=1;i<=n;i++)
{
printLine(c,i);
}
}
public static void printLine(char c,int col)
{
System.out.println("\n");
for(int j=1;j<=col;j++)System.out.println(c);
}
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
char ch=s1.next().charAt(0);
int row=s1.nextInt();
printPattern(ch,row);
}
}

