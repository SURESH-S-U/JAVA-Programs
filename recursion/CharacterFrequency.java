package recursion;
import java.util.Scanner;

public class CharacterFrequency {
	
	public static int frequency(String s,char ch,int count)
	{
		if(s.isEmpty()) return count;
		if(s.charAt(0)==ch) count++;
		return frequency(s.substring(1),ch,count);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char ch = sc.nextLine().charAt(0);
		System.out.print(frequency(name,ch,0));
		sc.close();
	}
}
