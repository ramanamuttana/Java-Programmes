package Arrayacollections;

public class Sort_Insertion {

	public static void main(String[] args) {
		        int[] arr1 = {10,34,2,56,7,67,88,42};
		        int[] arr2 = doInsertionSort(arr1);
		        for(int i:arr2){
		            System.out.print(i);
		            System.out.print(", ");
		        }
		    }
		     
		    public static int[] doInsertionSort(int[] input){
		         
		        int j,temp,k;
		        for (int i = 1; i < input.length; i++) {
		        	temp=input[i];
		        	j=i-1;
		            while( j >=0&& temp<input[j] ){
		                    k= input[j];
		                    input[j] = input[j+1];
		                    input[j+1] = k;
		                    j--;
		                }
		            }
		        return input;
	}

}
