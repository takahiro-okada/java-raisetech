import java.util.HashMap;

public class Cat {

    private String name;
    private int age;
    private HashMap<String, Integer> friends = new HashMap<>();


    public void addFriends(String name, int age) {
        friends.put(name, age);
    }

    public void showMyFriends() {
        friends.forEach((key, value) -> System.out.println("友だちの名前は" + key + "です！" + value + "歳です"));
    }

    public void showProfile() {
        if (age > 3) {
            System.out.println("私の名前は" + name + "です！" + "年齢は" + age + "の成猫です！！");
        } else {
            System.out.println("私の名前は" + name + "です！" + "年齢は" + age + "の子猫です！！");
        }
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public void setAge(int inputAge) {
        this.age = inputAge;
    }
}


