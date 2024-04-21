import java.util.*;
class OverloadFunction2
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
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
OverloadFunction2 obj=new OverloadFunction2();
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