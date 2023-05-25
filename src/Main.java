import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> result = integerList.stream().filter(i -> i % 2 == 1).toList();
        System.out.println(result);
        integerList.stream().map(i -> "要素は" + i + "です").forEach(System.out::println);


    }
}