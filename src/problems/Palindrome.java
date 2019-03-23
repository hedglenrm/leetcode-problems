package problems;

import java.util.ArrayList;
import java.util.List;

public class Palindrome extends Solution{

    private boolean palindrome(int num) {
        if(num < 0 || (num % 10 == 0 && num != 0)){
            return false;
        }
        
        int revertedNumber = 0;
        while(num > revertedNumber){
            revertedNumber = revertedNumber * 10 + num % 10;
            num /= 10;
        }
        
        return num == revertedNumber || num == revertedNumber / 10;
    }

    @Override
    public void run() {
        System.out.println(palindrome(121));

        System.out.println(palindrome(1001001));
    }
    
}