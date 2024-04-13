import java.util.*;
class OverloadedArea
{
double area(double a,double b,double c)
{
double s,area;
s=(a+b+c)/3.0;
area=Math.sqrt(s*s+a*s+b*s+c);
return area;
}

double area(int a,int b,int h)
{
double area=(1.0/2)*h*(a+b);
return area;
}

double area(double d1,double d2)
{
double area=(1.0/2)*d1*d2;
return area;
}

public static void main()
{
Scanner in=new Scanner(System.in);
OverloadedArea obj=new OverloadedArea();
double a,b,c,d1,d2,ar1,ar2,ar3;
int s1,s2,h;
System.out.println("Enter the sides of triangle");
a=in.nextDouble();
b=in.nextDouble();
c=in.nextDouble();
ar1=obj.area(a,b,c);

System.out.println("Enter the sides and height");
s1=in.nextInt();
s2=in.nextInt();
h=in.nextInt();
ar2=obj.area(s1,s2,h);

System.out.println("Enter the diagonals of Paralellogram");
d1=in.nextDouble();
d2=in.nextDouble();
ar3=obj.area(d1,d2);

}
}