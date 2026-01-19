import com.tss.model.Box;
import java.util.Scanner;

public class BoxMain {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==== Box Volume Calculator ====");

        Box[] boxes = new Box[3];

        for (int i = 0; i < boxes.length; i++) {
            System.out.println("\nEnter Width, Height, and Depth of Box " + (i + 1) + ":");
            boxes[i] = createBox();
        }

        System.out.println("\n==== Box Details and Volumes ====");
        for (int i = 0; i < boxes.length; i++) {
            System.out.println("\nBox " + (i + 1) + " Details:");
            boxes[i].printBox();
            System.out.println("Volume = " + boxes[i].calculateVolume());
        }

    }

    private static Box createBox() {
        double width = getPositiveDouble("Width");
        double height = getPositiveDouble("Height");
        double depth = getPositiveDouble("Depth");
        return new Box(width, height, depth);
    }

    private static double getPositiveDouble(String fieldName) {
        double value;
        while (true) {
            System.out.print("Enter " + fieldName + " : ");
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive number!");
                }
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                scanner.next();
            }
        }
        return value;
    }
}



//import com.tss.model.Box;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//
//import java.util.Scanner;
//
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//
//        double width = 0, height  =0  , depth = 0;
//
//        System.out.println("Enter Width , Height , Depth of the Box 1:");
//        Scanner scanner = new Scanner(System.in);
//
//        width = scanner.nextDouble();
//        height = scanner.nextDouble();
//        depth  = scanner.nextDouble();
//
//        Box box1 = new Box(width , height , depth);
////        getDetails(width , height ,depth);
//        box1.setWidth(width);
//        box1.setHeight(height);
//        box1.setDepth(depth);
//
//        System.out.println("Enter Width , Height , Depth of the Box 2:");
//
//        width = scanner.nextDouble();
//        height = scanner.nextDouble();
//        depth  = scanner.nextDouble();
//
//        Box box2 = new Box(width , height , depth);
////        getDetails(width , height ,depth);
//
//        System.out.println("Enter Width , Height , Depth of the Box 3:");
//
//        width = scanner.nextDouble();
//        height = scanner.nextDouble();
//        depth  = scanner.nextDouble();
//
//        Box box3 = new Box(width , height , depth);
////        getDetails(width , height ,depth);
//
//        System.out.println("Details of Box 1 ==>");
//        box1.printBox();
//        System.out.println("Details of Box 2 ==>");
//        box2.printBox();
//        System.out.println("Details of Box 3 ==>");
//        box3.printBox();
//
//        System.out.println("Volume of the Box 1 = " + box1.calculateVolume());
//
//        System.out.println("Volume of the Box 2 = " + box2.calculateVolume());
//
//        System.out.println("Volume of the Box 3 = " + box3.calculateVolume());
//    }
////
////    private static void getDetails(double width , double height , double depth){
////
////
////        box1.setWidth(width);
////        box1.setHeight(height);
////        box1.setDepth(depth);
////
////    }
//}