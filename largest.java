import java.io.*;
import java.util.*;
class largest
{
public static void main(String args[])
{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
int n3=Integer.parseInt(args[2]);
int large=n3>(n1>n2 ? n1:n2) ? n3:(n1>n2 ? n1:n2);
System.out.println("The largest number is"+" "+large);
}
}
