import java.io.*;
import java.util.*;
class posneg
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
if(num>0)
System.out.println("The number is positive");
else if(num<0)
System.out.println("The number is negative");
else if(num==0)
System.out.println("The number is zero");
else
System.out.println("The given input is not valid");
}
}

