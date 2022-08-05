import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //        6文字以上の関東エリアの県名を表示する
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

        //        Streamを連結する書き方
        List<String> fruits = Arrays.asList("Orange", "Apple", "Lemon", "Grape", "Strawberry");
        List<String> myFavoriteFruits = Arrays.asList("Apple", "Lemon");
        fruits.stream()
                //                フルーツをループ処理で表示する
                .forEach(v -> {
                    System.out.println(v);
                });
        

    }
}