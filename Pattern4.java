import java.util.Scanner;
class Pattern4
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
char ch=s1.next().charAt(0);
int row=s1.nextInt();
int x,y;
if(row % 2 ==0)x=y=row/2;
else
{
x=row/2;y=row/2+1;}
printPattern(ch,x);
printReversePattern(ch,y);
}
public static void printReversePattern(char c,int n)
{
for(int i=n;i>=1;i--){
printLine(c,i);
}
}
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
for(int j=1;j<=col;j++)System.out.print(c);
}
}


