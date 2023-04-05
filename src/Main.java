public class Main {

    public static void main(String[] args) {
        test(23, 10);
        test(18, 25);
        test(50, 0);
        test(generateRandomAge(), -5);
        test(generateRandomAge(), 20);
    }

    public static String checkWeather(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static void test(int age, int temperature) {
        System.out.println("Возраст: " + age + ", температура на улице: " + temperature + " - " + checkWeather(age, temperature));
    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 100)+1;
    }
}