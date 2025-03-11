import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");

        int [] intArray = new int [3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] =3;
        double [] doubleArray = {1.57, 7.654, 9986};
        String [] stringArray = {" winter ", " summer "};



        // Task 2
        System.out.println("Task 2");

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1 ){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubleArray.length; i++){
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < stringArray.length; i++){
            System.out.print(stringArray[i]);
            if (i < stringArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();



        // Task 3
        System.out.println("Task 3");

        for (int i = intArray.length-1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i > 0 ){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubleArray.length - 1; i >= 0 ; i--){
            System.out.print(doubleArray[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = stringArray.length - 1; i >= 0 ; i--){
            System.out.print(stringArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Task 4
        System.out.println(" Task 4 ");

        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] % 2 !=0){
                intArray[i] += 1;
            }
        }
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }
}