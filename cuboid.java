import java.io.*;
import java.util.*;
class cuboid
{
public static void main(String args[])
{
int l=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int h=Integer.parseInt(args[2]);
int total,volume;
total=2*((l*b)+(b*h)+(h*l));
volume=l*b*h;
System.out.println(total+" "+volume);
}
}
