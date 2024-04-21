import java.util.*;
class CheckPalprimeNum
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,i,d,c=0,rev=0;
System.out.println("Enter a number to be checked");
n=in.nextInt();
for(i=1;i<=n;i++)
{
if (n%i==0)
c++;
}
i=n;
while(i>0)// or i!=0
{
d=i%10;
rev=rev*10+d;
i=i/10;
}
if(rev==n&&c==2)
System.out.println(n+" is a Palprime number");
else
System.out.println(n+ " is Not Palprime number");
}
}