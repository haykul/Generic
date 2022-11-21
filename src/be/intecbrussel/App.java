package be.intecbrussel;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
     /*   Predicate <String> stringIsNotNull=element->element!=null;
        Predicate<String>stringIsNotEmpty=element->!element.isEmpty()
        String [] strArr={"Hello", "World", "",null, "Generic"};
        System.out.println(Arrays.toString(strArr));
        Stream.of(strArr)
                .peek(word-> System.out.println(word))
             //   .peek(System.out::println);
        .filter(stringIsNotNull)
                .filter(stringIsNotEmpty)
                .forEach(word-> System.out.println("FILTERED:"+word));*/
        Predicate <String> removeNullValues=element->element!=null;
        Predicate<String>removeEmptyStrings=element->!element.isEmpty();
        String [] strArr={"Hello", "World", "",null, "Generic"};
        System.out.println(Arrays.toString(strArr));
        Stream.of(strArr)
                .peek(word-> System.out.println(word))
                //   .peek(System.out::println);
                .filter(removeNullValues)
                .filter(removeEmptyStrings)
                .forEach(word-> System.out.println("FILTERED:"+word));
    }
}
