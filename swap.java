import java.io.*;
import java.util.*;
class swap
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int num1=scan.nextInt();
int num2=scan.nextInt();
int temp;
System.out.println("Before swapping:"+num1+" "+num2);
temp=num1;
num1=num2;
num2=temp;
System.out.println("After swapping:"+num1+" "+num2);
}}
