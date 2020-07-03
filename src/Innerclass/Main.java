package Innerclass;

import java.util.Scanner;

/**
 * @author Esmee Zhang
 * @date 7/1/20 2:00 下午
 * @projectName JAVA-master-class
 */
public class Main {
    private static Scanner scanner = new Scanner((System.in));
    private static Button btnPrint = new Button("Print");



    public static void main(String[] args) {
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("i've been attached");
//            }
//
//            public void onClick(String title) {
//                System.out.println(title + "was clicked");
//            }
//        }
        //annomous class
        btnPrint.setOnClickLister(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + "was clicked");
            }
        });
        listen();
    }

        private static void listen(){
            boolean quit = false;
            while(!quit){
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice){
                    case 0 :
                        quit = true;
                        break;
                    case 1:
                        btnPrint.onClick();
                        break;
                }
            }
        }
//        GearBox mcLearn = new GearBox(6);
//
//        mcLearn.operateClutch(true);
//        mcLearn.changeGear(1);
//        mcLearn.operateClutch(false);
//        System.out.println(mcLearn.wheelSpeed(1000));
//        mcLearn.changeGear(2);
//        System.out.println(mcLearn.wheelSpeed(2000));
//        mcLearn.operateClutch(true);
//        mcLearn.changeGear(3);
//        mcLearn.operateClutch(false);
//        System.out.println(mcLearn.wheelSpeed(6000));

}
