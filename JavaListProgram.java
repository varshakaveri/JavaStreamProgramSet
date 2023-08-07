import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class JavaListProgram{
    public static void main(String args[]){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(90);
        arrayList.add(60);
        arrayList.add(50);
        System.out.println("ArrayList : " +arrayList);

        List<Integer> arrayList1 = Arrays.asList(20,40,60,80,100);

        int position = Collections.binarySearch(arrayList1, 100);
        System.out.println("BinarySearch of the given number into arrayList : " +position);

        ArrayList<Integer> newArrayList = new ArrayList<>();

        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList : " +arrayList);

        Collections.shuffle(arrayList);
        System.out.println("Shuffled ArrayList : " +arrayList);

        Collections.reverse(arrayList);
        System.out.println("Reversed ArrayList : " +arrayList);

        Collections.swap(arrayList, 0, 3);
        System.out.println("Sorted ArrayList : " +arrayList);

        newArrayList.addAll(arrayList);
        newArrayList.add(20);
        newArrayList.add(30);
        newArrayList.add(60);
        System.out.println("Added previous arrayList into new arrayList : " +newArrayList);

        Collections.copy(newArrayList, arrayList);
        System.out.println("Copy previous new arrayList into arrayList : " +arrayList);

        Collections.fill(arrayList, 20);
        System.out.println("Find number in ArrayList : " +arrayList);

        int count = Collections.frequency(arrayList, 20);
        System.out.println("Frequency of the given number into arrayList : " +count);


    }
}