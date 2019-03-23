package problems;

public class ReverseInteger extends Solution{


    @Override
    public void run() {

        System.out.println(reverse(123)); //321
//        System.out.println(reverse(-123)); //321
//        System.out.println(reverse(120)); //21

    }

    public int reverse(int x){

        int number = 0;        
        while(x != 0){
            int temp = x % 10;
            x /= 10;
            if (number > Integer.MAX_VALUE/10 || (number == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (number < Integer.MIN_VALUE/10 || (number == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            number = number * 10 + temp;

        }

        return number;
    }

}
