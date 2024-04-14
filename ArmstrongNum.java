import java.util.*;
class ArmstrongNumCheck
{
public static void main()
{
Scanner in=new Scanner(System.in);
int n,s=0,cb,d;
System.out.println("Enter a number");
n=in.nextInt();
cb=n*n*n;
while(cb>0)
{
d=cb%10;
s=s+d;
cb=cb/10;
}
if(s==n)
System.out.println("Armstrong Number");
else
System.out.println("Not armstrong number");
}
}