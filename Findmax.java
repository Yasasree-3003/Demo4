import java.util.*;
class Findmax
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
if(a>c)max=a;
else max=c;
}
else
{
if (b>c)max=b;
else max=c;
}
System.out.println("maximum no is "+max);
}
}

