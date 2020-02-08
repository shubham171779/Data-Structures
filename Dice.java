import java.util.*;
public class Dice
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[11];
int a,b;
Random random=new Random();
for(int i=0;i<n;i++)
{
a=random.nextInt(6)+1;
b=random.nextInt(6)+1;
arr[a+b-2]++;
System.out.println(a+b);
}int j=2;
for(int i=0;i<11;i++)
{
	
System.out.println(j+" "+arr[i]);
j++;
}
}
}
