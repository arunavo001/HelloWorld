import java.util.Scanner;

public class removeDuplicatesFromList
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        removeDuplicatesFromList obj=new removeDuplicatesFromList();
        obj.duplicates(arr);
    }
    public void duplicates(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)

            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(arr[i]);
            }
            count=0;
        }
    }
}
