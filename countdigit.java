import java.io.*;
import java.util.*;
public class countdigit
{
public static void main(String args[])
{
int count=0;
int n=Integer.parseInt(args[0]);
while(n>0)
{
n=n/10;
count++;
}
System.out.println(count);
}
}
