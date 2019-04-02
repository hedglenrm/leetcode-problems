package problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt extends Solution{

    @Override
    public void run() {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
    }

    private int romanToInt(String string) {
        

        char[] charArray = string.toCharArray();
        char prev = 0;
        int num = 0;
        Map<Character, Integer> translateMap = loadRomanValues();

        for(char c : charArray){

            switch(c){
                case 'I':
                    num += 1;

                    break;

                case 'V':
                    num += 5;
                    if(prev == 'I'){
                        num -= 2;
                    }
                    break;
                case 'X':
                    num += 10;
                    if(prev == 'I'){
                        num -= 2;
                    }
                    break;
                case 'L':
                    num += 50;
                    if(prev == 'X'){
                        num -= 20;
                    }
                    break;
                case 'C':
                    num += 100;
                    if(prev == 'X'){
                        num -= 20;
                    }
                    break;
                case 'D':
                    num += 500;
                    if(prev == 'C'){
                        num -= 200;
                    }
                    
                    break;
                case 'M':
                    num += 1000;
                    if(prev == 'C'){
                        num -= 200;
                    }
                    break;

            }
            prev = c;

        }  
        
        return num;
    }

    public Map<Character, Integer> loadRomanValues(){
        Map<Character, Integer> theMap = new HashMap<>();
        theMap.put('I',  1 );
        theMap.put('V',  5 );
        theMap.put('X',  10 ); 
        theMap.put('L',  50 ); 
        theMap.put('C',  100 );  
        theMap.put('D',  500 );  
        theMap.put('M',  1000 );   
        return theMap;       
        
    }

}