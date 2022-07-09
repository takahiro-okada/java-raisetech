public class Main {
    public static void main(String[] args) {

        // variables
        String greetingEnglish = "Hello World";
        String greetingJapanese = "こんにちは";
        System.out.println(greetingEnglish);
        System.out.println(greetingJapanese);

        //for
        for(int i = 0; i <= 9; i++) {
            System.out.println(i + "回目の" + greetingEnglish);
        }

        //Array
        String[] stringArray = {"Sunday", "Monday", "Tuesday"};
        for (String date : stringArray) {
            System.out.println(date);
        }
    }
}