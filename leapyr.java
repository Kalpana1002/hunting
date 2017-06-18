import java.io.*;
import java.util.*;
class leapyr
{
public static void main(String args[])
{
int year=Integer.parseInt(args[0]);
if((year%400==0)|| ((year%4==0) && (year%100!=0)))
System.out.println(year+"is leap year");
else
System.out.println(year+"is not leap year");
}
}
