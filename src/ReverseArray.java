import java.util.Arrays;

/**
 * @author Esmee Zhang
 * @date 6/20/20 8:37 下午
 * @projectName JAVA-master-class
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,4,2,7,9,3,6};
        System.out.println(Arrays.toString(array));
        reverse(array);

    }

    public static void reverse(int[] array){
        int start = 0;
        int end = array.length - 1;
        while(start < end){

            int temp = 0;
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start ++;
            end --;
        }
        System.out.println(Arrays.toString(array));
    }
}
