package FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> flattenedList = nestedList.stream()
                        .flatMap(list -> list.stream())  // list -> list.stream()
                        .toList();

        System.out.println("Before flattening:\t" + nestedList);
        System.out.println("After flattening:\t" + flattenedList);
    }

}