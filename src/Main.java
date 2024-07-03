public class Main {
    public static void main(String[] args) {
        int amount = 20_000; // стоимость билета
        int percent = 5; // процент с покупки билета

        int bonus = amount * percent / 100;

        System.out.println("Стоимость билета:" + amount + " рублей ");
        System.out.println("Накопленные мили:" + bonus);
    }
}



