import java.util.*;
class AutomorphicNum
{
public static void main(String args[])
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
System.out.println(n+ " is an Automorphic number.");
else
System.out.println(n+" is not an Automorphic number.");
}
}