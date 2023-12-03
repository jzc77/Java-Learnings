package FlatMap;

import java.util.Arrays;
import java.util.List;

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

        // ---------------
        List<List<List<Integer>>> evenMoreNestedList = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(4, 5, 6),
                        Arrays.asList(7, 8, 9)
                ),
                Arrays.asList(
                        Arrays.asList(10, 11, 12),
                        Arrays.asList(13, 14, 15)
                ),
                Arrays.asList(
                        Arrays.asList(16, 17, 18),
                        Arrays.asList(19, 20)
                )
        );
// BAD
//        List<Integer> flattenedEvenMoreNestedList = evenMoreNestedList.stream()
//                .flatMap(outerList -> outerList.stream().flatMap(innerList -> innerList.stream()))
//                .toList();

// BETTER
//        List<Integer> flattenedEvenMoreNestedList = evenMoreNestedList.stream()
//                .flatMap(outerList -> outerList.stream())
//                .flatMap(innerList -> innerList.stream())
//                .toList();

// BEST
        List<Integer> flattenedEvenMoreNestedList = evenMoreNestedList.stream()
                .flatMap(List::stream)
                .flatMap(List::stream)
                .toList();

        System.out.println("Before flattening:\t" + evenMoreNestedList);
        System.out.println("After flattening:\t" + flattenedEvenMoreNestedList);
    }

}