public class CatNew {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("Taroooooo");
        cat.setAge(4);
        cat.showProfile();
        cat.addFriends("シロ", 2);
        cat.addFriends("クロ", 9);
        cat.addFriends("タマ", 4);
        cat.addFriends("ジロー", 12);
        cat.showMyFriends();
    }
}