package Max_Contiguous;
public class Max_Contiguous {

    public int Max_Contiguous (int[] inputNumbers){

        int[] addedElements = new int[inputNumbers.length];
        int initial = 0;
        int result = addedElements[initial];
        addedElements[initial] = inputNumbers[initial];


        for(int position=1; position<inputNumbers.length; position++){
            if(addedElements[position-1]>0){
                addedElements[position]= inputNumbers[position]+addedElements[position-1];
            }else{
                addedElements[position] = inputNumbers[position] + 0;
            }
            result = Math.max(result, addedElements[position]);
        }
    return result;
    }

}
