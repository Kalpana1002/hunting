import java.io.*;
import java.util.*;
class arminterval
{
public static void main(String args[])
{
int arm=0;
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
for(int i=num1+1;i<num2;i++)
{
while(i>0)
{
int m=i%10;
arm+=m*m*m;
i=i/10;
}
if(arm==i)
{
System.out.print(i+" ");
}
arm=0;
}
}
}
