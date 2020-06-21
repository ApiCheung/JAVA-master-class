import java.util.Scanner;

/**
 * @author Esmee Zhang
 * @date 6/19/20 8:31 下午
 * @projectName JAVA-master-class
 */
public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getArray(5);

    }

    public static int[] getArray(int capacity) {
        int[] array = new int[capacity];
        System.out.println("enter" + capacity);
        for(int i=0; i< array.length; i++){
            array[i] = scanner.nextInt();

        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i] + " ");
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i = 0; i< array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i<array.length; i++){
                if(sortedArray[i] < sortedArray[i +1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
