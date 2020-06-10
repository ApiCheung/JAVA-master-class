/**
 * @author Esmee Zhang
 * @date 6/9/20 3:44 下午
 * @projectName JAVA-master-class
 */
import java.util.Scanner;
public class maxInput {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        System.out.println("input an number");

        while(true){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int num = scanner.nextInt();
                if(num < min){
                    min = num;
                }
                if(num > max){
                    max = num;
                }
                scanner.nextLine();
                System.out.println("input an number");

            }else{
                break;
            }



        }
        System.out.println("max is " + max + ", min is " + min);*/
        System.out.println(getBucketCount(2.75,3.25,2.5,1));


    }


    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long average = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int num = scanner.nextInt();
                sum += num;
                count += 1;
                scanner.nextLine();
            }else{
                break;
            }
        }
        average = Math.round((double)sum/(double)count);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width < 0 || height < 0 || areaPerBucket < 0 || extraBuckets < 0){
            return -1;
        }else{
            double area =  width * height;
            double num = area / areaPerBucket;
            int result = (int)Math.round(num - extraBuckets);
            return result;

        }


    }
}
