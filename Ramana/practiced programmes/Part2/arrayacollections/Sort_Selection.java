package arrayacollections;
import java.util.Scanner;

public class Sort_Selection {
	
 public static void sort(int[] v)
		{
			int min,k,ak;
			//int v[]=new int[6];
			//Scanner scan= new Scanner(System.in);
			for(int i=0;i<v.length-1;i++)
			{
				min=i;
				//v[i]=scan.nextInt();
				for (k=i+1;k<v.length;k++)
				{
					if(v[k]<v[min])
					{
						min=k;
						ak=v[min];
						v[min]=v[i];
						v[i]=ak;
					}
				}
				
				//System.out.println(v[i]);
				//return;
			}
			
		}
public static void main(String[] args)
{
	int a[]={23,45,3,34,566,78,1,45,67,77,90};
	sort(a);
	for(int i:a)
	{
		System.out.println(i);
	}
}
}
