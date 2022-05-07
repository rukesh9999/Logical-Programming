package com.logics.array;

import java.util.Arrays;

public class Game {
	/**
	*	pick {choices} numbers out of 1 to {maxNum}

	*/

    int secrete[] ={0,0,0,0};
	public Game(int maxNum, int choices) {
  
           int min=1;
           
           
           int max = maxNum;
           int range = max-min+1;
           for(int i=0;i<choices;i++)
           {
              int randomNumber = (int) (Math.random()*range)+min;  
               secrete[i]=randomNumber;  
           }
          
	}

	/**
	* A player tries to guess numbers the game has already generated
	* payoff if proportional to number of correct guesses
	*
	* lets say game picked: [7, 11, 13, 19]
	* if guess is:
	*	[11, 7, 13, 19] => payout should be 4
	* 	[1, 3, 9, 11] -> payout is 1
	* 	[1, 6, 8, 12] -> payout is 0
	*/
	public int guess(int[] nums) {
            int matchCount=0;
            for(int i=0;i<nums.length;i++){
                    
                 for(int j=0;j<secrete.length;j++){
                        if(nums[i]==secrete[j]){
                           matchCount++;
                         }
                  }
              }          
         
             return matchCount;
	}





// Client Stub
	public static void main(String args[]) {
		// pick 4 numbers out of 1 to 20
		// lets say the game chose 7, 11, 13, 19
		Game game = new Game(20, 4);
		int[] myGUess = {1, 3, 8, 11}; 
		int payoff = game.guess(myGUess);
		System.out.println("secrete array "+Arrays.toString(game.secrete));
		System.out.println("Given array "+Arrays.toString(myGUess));
		System.out.println(payoff); // prints 1                       
	}	
	
	
	
	
}
