import java.util.*;
class OverloadingFunctionSeries
{
void series()
{
int i;
System.out.println("Function 2 ");
for(i=1;i<=19;i+=2)
{
System.out.print(i+" ");
}
}

void series(int n)
{
int i,a=1;
System.out.println("Function 1 ");
for(i=1;i<=n;i++)
{
System.out.println(a+" ");
a+=3;
}
}

public static void main(String args[])
{
Scanner in=new Scanner(System.in);
OverloadingFunctionSeries obj=new OverloadingFunctionSeries();
int n;
System.out.println("Enter n ");
n=in.nextInt();
obj.series(n);

obj.series();
}
}
