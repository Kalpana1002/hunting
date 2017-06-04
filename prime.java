import java.io.*;
import java.util.*;
class prime
{
public static void main(String args[])
{
int flag=0;
int num=Integer.parseInt(args[0]);
for(int inp=2;inp<=num/2;inp++)
{
if(num%inp==0)
{
System.out.println("Not a Prime");
flag=1;
break;
}
}
if(flag==0)
System.out.println("Prime");
}}
