import java.util.HashMap;

public class Cat {
    private int age;

    public void SetAge(int inputAge) {
        this.age = inputAge;
    }

    private String name;

    public void setName(String inputName) {
        this.name = inputName;
    }

    public void showProfile() {
        if (age > 3) {
            System.out.println("私の名前は" + name + "です！" + "年齢は" + age + "の成猫です！！");
        } else {
            System.out.println("私の名前は" + name + "です！" + "年齢は" + age + "の子猫です！！");
        }
    }

    public void showMyFriends() {
        HashMap<String, Integer> friends = new HashMap<String, Integer>();
        friends.put("シロ", 2);
        friends.put("クロ", 9);
        friends.put("タマ", 4);
        friends.put("ジロー", 12);

        friends.forEach((key, value) -> System.out.println("友だちの名前は" + key + "です！" + value + "歳です"));
    }
}


