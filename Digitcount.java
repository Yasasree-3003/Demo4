import java.util.Scanner;
public class Digitcount
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
//char ch=s1.next().charAt(0);
String str=s1.nextLine();
int count=0;
for(int i=0;i<=str.length()-1;i++)
{
if((str.charAt(i)=='0')||(str.charAt(i)=='1')||(str.charAt(i)=='2')||(str.charAt(i)=='3')||(str.charAt(i)=='4')||(str.charAt(i)=='5')||(str.charAt(i)=='6')||(str.charAt(i)=='7')||(str.charAt(i)=='8')||(str.charAt(i)=='9'))
{
count++;
}
}
System.out.println(count);
}
}