/**
 * @author Esmee Zhang
 * @date 6/9/20 3:19 下午
 * @projectName JAVA-master-class
 */
import java.util.Scanner;
public class inputChanllene {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 10;
        int sum = 0;
        while(count > 0){
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int num = scanner.nextInt();
                System.out.println("Enter number #" + num);
                count --;
                sum += num;
            }else{
                System.out.println("invalid input");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();

    }
}
