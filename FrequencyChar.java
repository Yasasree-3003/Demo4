import java.util.Scanner;
public class FrequencyChar
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
String str=s1.nextLine();
char ch=s1.next().charAt(0);
int count=0;
for(int i=0;i<=str.length()-1;i++)
{
if(str.charAt(i)==ch)
{
count++;
}
}
System.out.println(count);
}
}