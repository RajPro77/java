import java.util.*;
class OverloadedFunctionLib
{
void series(int n)
{
int i,s=0;
for(i=1;i<=n;i++)
{
s=s+(i*n);
System.out.println(s);
}
}
void series(int n, int a)
{
int i,p;
for(i=1;i<=n;i++)
{
p=(int)(Math.pow(a,i));
System.out.println(p);
}
}
public static void main()
{
Scanner in=new Scanner(System.in);
OverloadedFunctionLib obj=new OverloadedFunctionLib();
int n;
System.out.println("Enter a number");
n=in.nextInt();
obj.series(n);

int n2,a;
System.out.println("Enter n and a");
n=in.nextInt();
a=in.nextInt();
obj.series(n,a);
}
}