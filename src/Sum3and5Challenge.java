/**
 * @author Esmee Zhang
 * @date 6/7/20 4:50 下午
 * @projectName JAVA-master-class
 */
public class Sum3and5Challenge {
    public static void main(String[] args) {
        int result = 0;
        int count = 0;
        for(int i = 1; i < 1000; i++){
            if( i%3 == 0 && i % 5 == 0){
                System.out.println(i);
                result += i;
                count += 1;
            }
            if(count == 5)
                break;

        }
        System.out.println(result);

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


}
