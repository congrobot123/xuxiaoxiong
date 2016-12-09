import java.lang.String;
import java.util.Scanner;
public class  Test01 
{
	public static void main(String[] args) 
		
	{
		Scanner sc = new  Scanner(System.in);
		String str = sc.next();
		String[] str1 = str.split(",");

		for(int i =0;i < str.length(); ++i)
		System.out.print(str1[i]);
		
	}
}
