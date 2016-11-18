package Arrayacollections;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Arrays {
			static  Scanner scan=new Scanner(System.in);
         	public static void main(String[] args) 
         	{
					int counts=scan.nextInt();
				    int[] days= new int[counts];
				       
				         for(int i=0;i<counts;i++)
				         {
				        	 days[i]=(int)(Math.random()*100+1);
				         }
				         Arrays.sort(days); 
				         System.out.println(Arrays.toString(days));
				    	 

					}
		}
