import java.io.*;
import java.util.*;
class multable
{
public static void main(String args[])
{
int mul;
int n=Integer.parseInt(args[0]);
for(int i=0;i<=16;i++)
{
mul=n*i;
System.out.println(n+"*"+i+"="+mul);
}
}
}
