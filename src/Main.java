import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> areaList = Arrays.asList(
                "Tokyo",
                "Chiba",
                "Saitama",
                "Kanagawa",
                "Gunma",
                "Tochigi",
                "Ibaraki",
                "Yamanashi"
        );
        Stream<String> stream = areaList.stream();

        Stream<String> stream2 = stream.filter(str -> str.length() >= 6);
        stream2.forEach(str -> System.out.println(str));
    }
}