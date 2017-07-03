import java.io.*;
import java.util.*;
class armstrong
{
public static void main(String args[])
{
int arm=0;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num1=num;
while(num>0)
{
int m=num%10;
arm+=m*m*m;
num=num/10;
}
if(arm==num1)

System.out.println(arm+" "+"is armstrong number");
else
System.out.println(arm+" "+"is not armstrong number");

}
}
