package hmjc.hm2.hm21;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        TreeSet<Integer> set = new TreeSet<>();
        System.out.println("without stream");
        for (int i : intList) {
            if ((i > 0) && (i % 2 == 0)) {
                set.add(i);
            }
        }

        for (int i : set) {
            System.out.println(i);
        }
        System.out.println("\nwith stream");
        StreamMain.main();

    }

}
