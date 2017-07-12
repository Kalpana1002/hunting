import java.io.*;
import java.util.*;
class factorial
{
public static void main(String args[])
{
int fact=1;
int n=Integer.parseInt(args[0]);
for(int i=n;i>0;i--)
fact*=i;
System.out.print(fact);
}
}
