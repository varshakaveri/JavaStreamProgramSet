// Create a List<integer> add some values in it and filter all even numbers abd return to list again using java 8 stream
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaListEvenProgram{
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(4,6,2,3,7,8);
        list.stream().sorted().filter(value -> value%2==0).forEach(System.out::println);

        List<String> strList = list.stream().sorted().filter(value -> value%2 == 0).map(String::valueOf).collect(Collectors.toList());

        System.out.println(strList);
    }
}