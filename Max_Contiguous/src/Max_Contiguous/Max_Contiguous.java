package Max_Contiguous;

/*This class is implementing the calculation for accumulating the contiguous elements up to maximum output.
 The input array will be inserted as a parameter by user. */

public class Max_Contiguous {

    //@param inputNumbers by user input in the main class.
    public int Max_Contiguous (int[] inputNumbers){

        int[] addedElements = new int[inputNumbers.length];
        int initial = 0;
        int zero = 0;
        int result = addedElements[initial];
        addedElements[initial] = inputNumbers[initial]; //The new sub-array for adding the contiguous elements.


        for(int position=1; position<inputNumbers.length; position++){
            
            if(addedElements[position-1]>0){ //If the element is larger than zero, then it will be summed in the new sub-array.
                addedElements[position]= inputNumbers[position]+addedElements[position-1];
            }else{ //If the element is smaller than zero, then it will be treated as non-value, zero, in order to find the maximum value.
                addedElements[position] = inputNumbers[position] + zero;
            }
            result = Math.max(result, addedElements[position]); //Compare the current added sub-array value and the previous sub-array value in order to find the max value.
        }
    return result;
    }//Max_Contiguous

}//Max_Contiguous
