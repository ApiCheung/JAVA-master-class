import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Esmee Zhang
 * @date 6/20/20 8:13 下午
 * @projectName JAVA-master-class
 */
public class Arraymin {
    public static void main(String[] args) {
        int[] array = readIntegers(5);
        int result = findMin(array);
        System.out.println(Arrays.toString(array));
        System.out.println(result);

    }

    public static int[] readIntegers(int count){
        int[] array  = new int[count];
        Scanner scanner = new Scanner(System.in);
        while(count > 0){
            array[count - 1] = scanner.nextInt();
            scanner.nextLine();
            count --;
        }
        return array;
    }

    public static int findMin(int[] array){
        int temp = array[0];
        for(int i = 1; i< array.length; i++){
            if(temp > array[i]){
                temp = array[i];
            }
        }
        return temp;
    }

}
