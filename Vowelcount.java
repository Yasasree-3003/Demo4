import java.util.Scanner;
public class Vowelcount
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
//char ch=s1.next().charAt(0);
String str=s1.nextLine();
int count=0;
for(int i=0;i<=str.length()-1;i++)
{
if((str.charAt(i)=='A')||(str.charAt(i)=='E')||(str.charAt(i)=='I')||(str.charAt(i)=='O')||(str.charAt(i)=='U')||(str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))
{
count++;
}
}
System.out.println(count);
}
}