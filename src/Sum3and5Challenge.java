/**
 * @author Esmee Zhang
 * @date 6/7/20 4:50 下午
 * @projectName JAVA-master-class
 */
public class Sum3and5Challenge {
    public static void main(String[] args) {
        //int result = 0;
        //int count = 0;
        //for(int i = 1; i < 1000; i++){
        //    if( i%3 == 0 && i % 5 == 0){
        //        System.out.println(i);
         //       result += i;
        //        count += 1;
        //    }
        //    if(count == 5)
        //        break;

        //}
        //System.out.println(result);

        //isPalindrome(11212);
        int[] dp = new int[10];
        dp[0] = 1;
        for(int a=0; a < 10; ++a){
            System.out.println(dp[a]);

        }
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);
        int number = Integer.parseInt(numberAsString);


    }
    public static boolean isOdd(int number){
        if(number <= 0) {
            return false;
        }
        if(number % 2 != 0){
            return true;
        }else {
            return false;
        }

    }
    public static int sumOdd(int start, int end){
        int result = 0;
        if(start > end || start < 0 || end < 0 ){
            return -1;
        }

        for(int i = start; i <= end; i++ ){
            if(isOdd(i)){
                result += i;
            }

        }
        return result;
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int temp = number;
        while (number != 0) {
            int lastDigit = number%10;
            reverse = (reverse * 10 +lastDigit);
            number = (int)number/10;
            System.out.println(number);
        }
        if(temp == reverse){
            return true;
        }else{
            return false;
        }

    }
    public static int sumFirstAndLastDigit(int number){
        int first = 0;
        int last = number % 10;
        if(number < 0){
            return -1;
        }else{
            if(number < 10){
                first = last;
                return first+last;
            }
            while(number>=10){
                number /= 10;
            }
            first = number;
            return first + last;
        }
    }
    public static int getEvenDigitSum(int number){

            int sum = 0;
            int digit = 0;
            if(number < 0){
                return -1;
            }else {
                while(number != 0){
                    digit = number % 10;

                    if(digit % 2 ==0){
                        sum += digit;
                    }
                    number /= 10;
                }
                return sum;

            }



        }


    public static boolean hasShareDigit(int a, int b){
        if((a > 99 || a < 10 ) && (b > 99 || b < 10)){
            return false;
        }else {
            while (a > 0) {
                int alst = a % 10;
                int blst = b;
                while (blst > 0) {
                    int compare = blst % 10;
                    if (alst == compare) {
                        return true;
                    }
                    blst /= 10;
                }
                a /= 10;

            }
            return false;
        }

    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) &&isValid(b) &&isValid(c)){
            int al = a % 10;
            int bl = b % 10;
            int cl = c % 10;
            if(al == bl || al == cl || bl == cl){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static boolean isValid(int a){
        if(a > 1000 || a < 10 ) {
            return false;
        }else{
            return true;
        }

    }
    public static int getGreatestCommonDivisor(int a, int b){
        int c = 0;
        if(a < 10 || b < 10){
            return -1;
        }else{
            for(int i = 2 ;i<=a; i++){
                if(a % i ==0){
                    for(int j = 2; j <=b; j++){
                        if(b % j == 0 && i == j){
                            c = j;
                        }
                    }
                }

            }

        } return c;

    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }else{
            if (((bigCount * 5) + smallCount) < goal){
                return false;
            }else{
                return goal % 5 <= smallCount;
            }

        }




    }
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }
        int x = 2;
        while(x < number){
            if(number % x != 0){
                x++;
            }else{
                number = number / x;
                x = 2;
            }


        }
        return number;


    }








}
