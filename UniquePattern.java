import java.util.*;
class UniquePattern
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,a,b;
for(i=1;i<=4;i++)
{
if(i%2==0)
{
a=1;
b=0;
}
else
{
b=1;
a=0;
}
for(j=1;j<=6;j++)
{
if(j%2==0)
System.out.print(b);
else
System.out.print(a);
}
System.out.println();
}
}
}
