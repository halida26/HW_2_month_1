import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(school(20, 28));
        System.out.println(school(17, -23));
        System.out.println(school(13, 15));
        System.out.println(school(65, -5));
        System.out.println(school(13, 8));
        System.out.println(school(generateRandomAge(), 30));
    }

    public static String school(int age, int temperature) {
        generateRandomAge();
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Оставайтесть дома";
        } else {
            return "Оставайтесть дома!";
        }
    }

    public static int generateRandomAge() {
        Random random1 = new Random();
        int age = random1.nextInt(0, 100);
        return age;
    }
}
