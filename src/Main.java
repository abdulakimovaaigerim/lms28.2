import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list2 = Arrays.asList(5, 23, 6, 0, 12, 123, 6, 5, 1, 99, 3, 4, 1, 2);
        System.out.println("Summa : "+list2.stream().reduce(0,Integer::sum));
        IntSummaryStatistics a = list2.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Arithmetic mean number: "+Math.floor(a.getAverage()));
        Set<Integer> set = new HashSet<>();
        System.out.println("Similar numbers: "+list2.stream().filter(n -> !set.add(n)).collect(Collectors.toSet()));
    }
}