import java.util.Scanner;
class Pattern
{
public static void printPattern(char c,int n)
{
for(int i=0;i<n;i++)
{
System.out.println("\n");
for(int j=0;j<=i;j++)System.out.print(c);
}
}
public static void main(String args[]){
Scanner s1=new Scanner(System.in);
char ch=s1.next().charAt(0);
int row=s1.nextInt();
printPattern(ch,row);
}
}
