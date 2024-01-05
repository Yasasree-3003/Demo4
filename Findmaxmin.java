import java.util.*;
class Findmaxmin
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int a=s1.nextInt();
int b=s1.nextInt();
int c=s1.nextInt();
int max;
if(a>b)
{
max=a;
else max=b; 
}
else
{
if (b>c)max=b;
else max=c;
}
System.out.println("maximum no is "+max);
}
}


