import java.util.*;

public class Array_CURD_ADT{

    static int size = 10;
    static int[] arr = new int[size];
    static int n = 0; 

    static void Insert(int val)
    {
        if(!(n >= size))
        {
            arr[n++] = val;
        }
    }

    static void InsertIdx(int idx, int val)
    {
        if(idx >= 10)
        {
            System.out.println("Over Flow Occurs");
            return;
        }

        if(n >= 10-1)
        {
            System.out.println("Array Already Full");
            return;
        }

        for(int i=size-1;i>idx;i--)
        {
            arr[i] = arr[i-1];
        }

        arr[idx] = val;
        n++;

    }

    static void Delete(int val)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i] == val)
            {
                for(int j=i; j < size-1; j++)
                {
                    arr[j] = arr[j+1];
                }

                n--;
                i--;
            }
        }
    }

    static void Display()
    {
        System.out.println("Array Elements ------------- > ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    while(true){
            System.out.println("Enter the Option : ");
            int Num = sc.nextInt();
            int val;

            switch(Num) {
                case 1:
                    System.out.println("Enter the element to Insert : ");
                    val = sc.nextInt();
                    Insert(val);
                    break;
                
                case 2:
                    System.out.println("Insert into The specific Index : ");
                    val = sc.nextInt();
                    int idx = sc.nextInt();
                    InsertIdx(idx,val);
                    break;
                
                case 3:
                    System.out.println("Delete the Specific Element : ");
                    val = sc.nextInt();
                    Delete(val);
                    break;
                
                case 4:
                    Display();
                    break;
                
                case 0 :
                    return;
            }
    
        }
    }
}
