import java.util.*;
class AutomrphicNumCheck
{
public static void main()
{
Scanner in=new Scanner(System.in);
int n ,sq,x,c=0,d,nn,nd;
System.out.println("Enter a number to be checked");
n=in.nextInt();
sq=n*n;
x=n;
while(x>0)
{
d=x%10;
c++;
x=x/10;
}
nd=(int)(Math.pow(10,c));
nn=sq%nd;
if(nn==n)
System.out.println("Automorphic number    "+n);
else
System.out.println("Not automorphic number    "+n);
}
}