import java.io.*;
import java.util.Scanner;
class Counting1
{
static boolean checkVowel(char c)
{
boolean b;
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='o'||c=='i'||c=='u')
{
b=true;
}
else
{
b=false;
}
return b;
}
public static void main(String args[])
{
String str;
int count=0;
Scanner s1=new Scanner(System.in);
System.out.println(" ");
System.out.print("Enter a String:");
str=s1.nextLine();
System.out.println(" ");
for(int i=0;i<str.length();i++)
{
if(checkVowel(str.charAt(i)))
{
count++;
}
}
System.out.println("\n  Number of Vowels="+count);
}
}



