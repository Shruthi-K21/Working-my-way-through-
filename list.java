import java.util.ArrayList;
import java.util.List;

public class Hello
{
public static void main(String[] args)
{
List<String> countries = new ArrayList<String>()
countries.add("Brazil");
countries.add("China");
countries.add("Cuba");
countries.add("Finland");
for(String country: countries)
{
System.out.println(country);
}
}
}