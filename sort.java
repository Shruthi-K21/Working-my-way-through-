import java.util.Arrays;
import java.util.Scanner;

public class Hello{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String input=sc.nextLine();
String[] strarr = input.split("[:]");
int[] numbers = new int[strarr.length];
int pos=0;
for(String a :strarr)
numbers[pos++] = Integer.parseInt(a);
Arrays.sort(numbers);
for(int num:numbers)
System.out.println(num);
}
}