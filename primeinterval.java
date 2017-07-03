import java.io.*;
import java.util.*;
class primeinterval
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int j;
int num1=sc.nextInt();
int num2=sc.nextInt();
for(int i=num1+1;i<num2;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
break;
}
if(i==j)
System.out.print(i+" ");
}
}}
