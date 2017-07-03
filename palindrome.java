import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])
{
String s=new String(args[0]);
StringBuffer sb=new StringBuffer(s);
sb.reverse();
String s1=String.valueOf(sb);
if(s.equals(s1))
{
System.out.println("The given string is palindrome");
}
else
{
System.out.println("The given string is not palindrome");
}
}
}
