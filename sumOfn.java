import java.io.*;
import java.util.*;
public class sumOfn
{
public static void main(String args[])
{
int sum=0;
int n=Integer.parseInt(args[0]);
for(int i=0;i<=n;i++)
sum=sum+i;
System.out.println(sum);
}
}
