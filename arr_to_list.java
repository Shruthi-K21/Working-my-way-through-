import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hello
{
 public static void main(String[] args)
{
Scanner sc = new Sccanner(System.in);
int n = sc.nextInt();
Integer[] numbers = new Integer[n];
for(int ctr = 0;ctr<n;ctr++)
{
numbers[ctr]=sc.nextInt();
}
List<Integer> numbersList = null;
numbersList = Arrays.asList(numbers);
for(Integer num :numbersList)
{
System.out.println(num);
}
}
}