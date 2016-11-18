package Arrayacollections;

import java.util.Scanner;

public class Sort_bubble {

	public static void main(String[] args)
	{
		int i,k;
		int v[]=new int[6];
		Scanner scan= new Scanner(System.in);
		for(int j=0;j<6;j++)
		{
			v[j]=scan.nextInt();
		}
		for(int j=0;j<6;j++)
		{
			for(i=j;i<6;i++)
			if(v[j]>v[i])
			{
				k=v[i];
				v[i]=v[j];
				v[j]=k;	
			}
			
		}
		 for (int j = 0; j < 5; j++) 
	        {
	            System.out.println("Bubble sort : " + v[j]);
		
	}

}}
