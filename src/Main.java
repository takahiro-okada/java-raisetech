import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 第1回
//        String greetingEnglish = "Hello World";
//        String greetingJapanese = "こんにちは";
//        System.out.println(greetingEnglish);
//        System.out.println(greetingJapanese);
//        for (int i = 0; i <= 9; i++) {
//            System.out.println(i + "回目の" + greetingEnglish);
//        }
//        String[] stringArray = {"Sunday", "Monday", "Tuesday"};
//        for (String date : stringArray) {
//            System.out.println(date);
//        }

        // 第2回
//        Cat cat = new Cat();
//
//        cat.setName("Taroooooo");
//        cat.setAge(4);
//        cat.showProfile();
//        cat.addFriends("シロ", 2);
//        cat.addFriends("クロ", 9);
//        cat.addFriends("タマ", 4);
//        cat.addFriends("ジロー", 12);
//        cat.showMyFriends();

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
        String userAge = "20";
        try {
            int age = Integer.parseInt(userAge);
            if (age >= 20) {
                System.out.println("You can get Alcohol!!");
            } else {
                System.out.println("You are too young to get Alcohol!!");
            }
        } catch (NumberFormatException e) {
            System.out.println("INPUT DATA IS NOT NUMBER!!");
        }

    }
}