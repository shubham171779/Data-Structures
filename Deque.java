public class Dqueue
{
    private static int front = -1;
    private static int reaar = 0;
    private static int size = 5;
    private static int [] arr = new int[size];
    static void InsertF ( int num )
    {
        if ( overflow() )
        {
            System.out.println("Array is full");
        }
        if(front==-1)
        {
            front=0;
            reaar=0;
        }
        else if(front==0)
        {
            front=size-1;
        }
        else
        {
            front--;
        }
        arr[front]=num;
    }
    static void InsertB ( int num )
    {
        if ( overflow() )
        {
            System.out.println("Array is full");
        }
        if(front==-1)
        {
            front=0;
            reaar=0;
        }
        else if(front==size-1)
        {
            reaar=0;
        }
        else
        {
            reaar++;
        }
        arr[reaar]=num;
    }
    static boolean overflow()
    {
        return((front==0 && reaar==size-1) || (front==reaar+1));
    }
    static boolean underflow()
    {
        return (front==-1);
    }
    static void deleteF()
    {
        if(underflow())
        {
            System.out.println("No Element in Array");
        }
        if(front==reaar)
        {
            front=-1;
            reaar=0;
        }
        else if(front==size-1)
        {
            front=0;
        }
        else
        {
            front++;
        }
    }
    static void deleteB()
    {
        if(underflow())
        {
            System.out.println("No Element in Array");
        }
        if(reaar==0)
        {
            reaar=size-1;
        }
        else if(front==reaar)
        {
            front=-1;
            reaar=0;
        }
        else
        {
            reaar--;
        }
    }
    static void print()
    {
        if(front>reaar)
        {
            for(int i=front;i<size;i++)
            {
                System.out.println(arr[i]);
            }
            for(int i=0;i<=reaar;i++)
            {
                System.out.println(arr[i]);
            }
        }
        else
        {
            for(int i=front;i<=reaar;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Dqueue d=new Dqueue();
        d.InsertF(20);
        d.InsertF(40);
        //d.InsertB(10);
        d.print();

    }
}
