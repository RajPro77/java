class HorizontalPyramidPattern
{
public static void main()
{
int i,j,k;
for(i=1;i<=5;i++)
{
for(k=1;k<=(5-i);k++)
System.out.print("  ");
for(j=1;j<=i;j++)
System.out.print(j+" ");
for(j=(i-1);j>=0;j--)
{
if(j!=0)
System.out.print(j+" ");
}
System.out.println();
}
}
}
