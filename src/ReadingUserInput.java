/**
 * @author Esmee Zhang
 * @date 6/9/20 2:32 下午
 * @projectName JAVA-master-class
 */
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ReadingUserInput {
    //nextline
    //scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scan in the consle back to the program
        System.out.println("enter your year of birth");
        boolean hasNextInt = scanner.hasNextInt();//check whether it is a numberof the next input
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();//接收一个会车
            System.out.println("enter your name");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;
            if(age>=0 && age <=10){
                System.out.println("your name is "+ name + " YOU ARE " + age);

            }else{
                System.out.println("invalid year of birth");
            }

        }else{
            System.out.println("unable pass year of birth");
        }


        scanner.close();

    }



}
