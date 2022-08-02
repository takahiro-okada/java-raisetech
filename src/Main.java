import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 第3回
        // List
        List<String> alcoholArray = new ArrayList<>();
        alcoholArray.add("ビール");
        alcoholArray.add("ワイン");
        alcoholArray.add("日本酒");
        alcoholArray.add("焼酎");
        alcoholArray.add("酎ハイ");
        alcoholArray.add("カクテル");
        System.out.println(alcoholArray.toString());
        for (String alcohol : alcoholArray) {
            System.out.println(alcohol);
        }

        // 例外処理
        String userAge = "hogehoge";
        try {
            int age = Integer.parseInt(userAge);
            if (age >= 20) {
                System.out.println("You can get Alcohol!!");
            } else {
                System.out.println("You are too young to get Alcohol!!");
            }
        } catch (NumberFormatException e) {
            System.out.println("INPUT DATA IS NOT NUMBER!!");
            throw e;
        }

    }
}