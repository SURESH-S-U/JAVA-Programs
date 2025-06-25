package recursion;
import java.util.Scanner;
public class VowelCount {
	
	public static boolean check(char ch)
	{
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') return true;
		else return false;
	}
	
	public static int count(String s,int len,int count)
	{
		if(len==s.length()) return count;
		if(check(s.charAt(len))) count++;
		return count(s,len+1,count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(count(s,0,0));
		sc.close();
	}

}
