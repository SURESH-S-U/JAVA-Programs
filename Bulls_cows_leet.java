import java.util.ArrayList;      // This question refers. If the same numbers in both string considerde as bulls.
                                 // If the same number in the same index considered as Cows.
public class Bulls_cows_leet {
    public static  void main(String[] args) {

        String secret = "1807";
        String guess = "7810";
        int  A_count = 0;
        int  B_count = 0;

        ArrayList<String> A_secret = new ArrayList<>();
        ArrayList<String> A_guess = new ArrayList<>();
        
        for(char c : secret.toCharArray())
        {
            A_secret.add(String.valueOf(c));
        }
        for(char c : guess.toCharArray())
        {
            A_guess.add(String.valueOf(c));
        }


        String str = String.join(",",A_guess);

 
        for(int i=0;i<A_secret.size();i++)
        {
            if( A_secret.get(i).equals(A_guess.get(i)))
            {
            System.out.print("("+A_secret.get(i)+","+A_guess.get(i)+")");
                A_count += 1;
                A_secret.remove(i);
                A_guess.remove(i);
                i--;   
            }
        }

        for(int i=0;i<A_secret.size();i++)
        {
            for(int j=0;j<A_guess.size();j++)
            {   
                if(A_secret.get(i).equals(A_guess.get(j)))
                {
                    B_count += 1;
                    A_secret.remove(i);
                    A_guess.remove(j);
                    i--;
                    j--;
                    break;
                }
            }
        }
        

        String out = A_count+"A"+B_count+"B";

        System.out.print(out);
    }
}