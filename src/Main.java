import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void calculationYear( int year){
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear){
            System.out.println(year + " високосный год!");
        }else {
            System.out.println( year + " год не високосный!");
        }
    }
    public static void detectionSoftVersion (int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && currentYear >= 2015){
            System.out.println("Установите обычную версию iOS");
        }else if (clientOS == 0 && currentYear < 2015){
            System.out.println("Установите lite - версию iOS");
        }
        if (clientOS == 1 && currentYear >= 2015) {
            System.out.println("Установите обычную версию Android");
        }else if (clientOS == 1 && currentYear < 2015){
            System.out.println("Установите lite - версию Android");
        }
    }
    public static void deliveriCard (int deliveriDistance){
        if (deliveriDistance < 19){
            System.out.println("Доставка 1 день");
        }
        if (deliveriDistance >= 20 && deliveriDistance <= 60){
            System.out.println("Доставка 2 дня");
        }
        if (deliveriDistance >= 61 && deliveriDistance <= 100){
            System.out.println("Доставка 3 дня");

        }
    }

    public static void main(String[] args) {
        int year = 1992;
        calculationYear(year);

        int clientOS = 1;
        detectionSoftVersion(clientOS);

        int deliveryDistance = 52;
        deliveriCard(deliveryDistance);





    }
}