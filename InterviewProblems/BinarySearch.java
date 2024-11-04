package org.interview;

public class BinarySerach {

    public static void main(String[] args ){
        int[] values={1,2,3,4,5,6,7,8,9,10};

        int a=binarySerach(values,9);
        System.out.println(a+" a value ");
    }
    public static int binarySerach(int[] values , int valueToFind){
        int firstIndex=0;
        int lastIndex=values.length-1;
       while(firstIndex<=lastIndex){
           int middleIndex = (firstIndex + lastIndex) / 2;
           int middleValue = values[middleIndex];
           if (middleValue == valueToFind) {
               return middleIndex;
           }else if(middleValue<valueToFind){  //6<9
            firstIndex=middleValue+1; //6-1=5  0 ,5
        }else if(middleValue>valueToFind){
                lastIndex=middleValue-1;
        }
       }
        return -1;
    }

}

