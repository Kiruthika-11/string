import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 int size=str.length();
		 for(int i=0;i<size;i++)
		 {
		     System.out.print(str.charAt(str.length()-i-1));
		 }
	}
}
