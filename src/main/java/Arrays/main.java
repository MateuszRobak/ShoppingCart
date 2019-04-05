package Arrays;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
//        int[] myIntArray = new int[5];
//        int[] anotherArray = myIntArray;
//        anotherArray[0] = 1;
//        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
//        System.out.println("anotherArray= " + Arrays.toString(anotherArray));
//
//        modifyArray(myIntArray);
//        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
//        System.out.println("anotherArray= " + Arrays.toString(anotherArray));


        GloceryList lista = new GloceryList();
        lista.addGroceryItem("Dupa");
        lista.addGroceryItem("Cipa");
        lista.addGroceryItem("Kutas");
        lista.printGroceryList();
        lista.findItem("Cipa");
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }

}
