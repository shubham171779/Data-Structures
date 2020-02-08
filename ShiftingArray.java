import java.util.Scanner;

public class ShiftingArray {

    public static void main(String[] args)
    {int index=0;
        Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2==0)
            {
                temp=arr[i];
               for(int j=i;j>=index;j--)
               {
                    if(j-1>=index)
                    {
                   arr[j]=arr[j-1];
               }}
               arr[index]=temp;
                index++;
            }


        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
