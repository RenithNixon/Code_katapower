import java.util.*;
class Power
{
static int pow(int a,int b)
{
int sum=1;
for(int i=0;i<b;i++)
{
sum=sum*a;
}
return sum;
}
public static void main(String args[])
{
int n,p;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
p=sc.nextInt();
if(p>0)
{
int ans=pow(n,p);
System.out.println("The power of the number is:"+ans);
}
else
{
System.out.println("Invalid Data");
}
}
}
