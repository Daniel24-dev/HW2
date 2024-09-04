public class HW2 {
    public static void main(String[] args) {
        System.out.println(permission(45, 50));
        System.out.println(permission(13, 70));
        System.out.println(permission(1, 43));
        System.out.println(permission(30, -3));
        System.out.println(permission(generateRandomAge(),10));

      //  System.out.println(generateRandomAge());



    }


    public static String permission(int age, int temperature) {
        // Условие для возраста от 20 до 45 лет и температуры от -20 до 30 градусов
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        }
        // Условие для возраста младше 20 лет и температуры от 0 до 28 градусов
        else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        }
        // Условие для возраста старше 45 лет и температуры от -10 до 25 градусов
        else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        }
        // Результат в любом случае
        else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge(){
        int minValue = 1;
        int maxValue = 100;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        return randomValue;
    }
}
