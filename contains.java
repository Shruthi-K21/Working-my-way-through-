import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public c;lass Hello
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String countries =  sc.nextLine();
String[] list = countries.split("[]");
List<String> countriesl = Arrays.asList(list);
if(countriesl.contains("Nepal")
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}