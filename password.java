import java.io.*;
import java.util.*;
class password
{
public static void main(String args[])
{
int sum=0,div=0;
Scanner scan=new Scanner(System.in);
String s1=scan.nexrLine();
char ch[]=s1.toCharArray();
int len=ch.length;
for(int inp=0;inp<ch.length;inp++)
{
sum=sum+(int)ch[inp];
}
div=(sum/len);
System.out.println((char)div);
}
}
