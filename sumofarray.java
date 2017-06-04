import java.io.*;
import java.util.*;
class sumofarray
{
public static void main(String args[])
{
int arr[]=new int[args.length];
for(int inp=0;inp<args.length;inp++)
{
arr[inp]=Integer.parseInt(args[inp]);
}
int size=arr.length;
Arrays.sort(arr);
System.out.println(arr[0]+arr[size-1]);
}}
