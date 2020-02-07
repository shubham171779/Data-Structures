public class Circular_Queue {

    static int[] arr =new int[5];
    private static int front=-1;
    private static int rear=-1;
    public static void main(String[] args) {

        insert(10);
        insert(50);
        insert(140);
        insert(510);
        insert(130);


        print();

        System.out.println("after deletion:");
        delete();
        print();
    }
    static void insert(int num) {
        if (overflow()) {
            System.out.print("overflow");
        } else {
            if (front == -1) {
                front = 0;
                rear = 0;
                arr[rear] = num;
            } else if (rear == 4) {
                rear = 0;
                arr[rear] = num;
            } else {
                rear++;
                arr[rear] = num;
            }
        }
    }
    static void delete() {
       if(underflow())
       {
           System.out.println("underflow");
       }
       else
       {
           if(front==rear)
           {
               front=rear=-1;
           }
           else if(front==4)
           {
               front=0;
           }
           else
           {
               front++;
           }
       }
    }
    static void print()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static boolean underflow()
    {

        return (front==-1 );
    }
    static boolean overflow()
    {
        if((front==0 && rear==4)||(front==rear+1))
        {
            return true;
        }
        else {
            return false;
    }
    }
}
