import org.w3c.dom.ls.LSOutput;


public class Main {


    public static void main(String[] args) {
        int amount = 20_000; // стоимость билета
        boolean ticket = true;

        int percent;
        if (ticket) {
            percent = 5;
        } else {
            percent = 0;
        }

        int bonus = amount * percent / 100;
        System.out.println("Стоимость билета:" + amount + " рублей ");
        System.out.println("Накопленные мили:" + bonus);
    }
}



