package Max_Contiguous;

/*This class is Main class. The user can change the input numbers by hardcoded arrays.
  Author: Hyejin Kim
  Date: 9/5/2021 */

public class Main {
  
    public static void main(String[] args){
        Max_Contiguous MC = new Max_Contiguous();
      
        int[] userInputs = {5,4,-1,7,8}; //User can change the input array here.
     
        System.out.println("The maximum output is " + MC.Max_Contiguous(userInputs));
    }

}
