import java.time.LocalDate;

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
    public static int deliveriCard (int deliveriDistance){
        if (deliveriDistance < 19){
            return (1);
        }
        if (deliveriDistance >= 20 && deliveriDistance <= 60){
            return (2);
        }
        if (deliveriDistance >= 61 && deliveriDistance <= 100){
            return (3);

        }
        return deliveriDistance;
    }

    public static void main(String[] args) {
        int year = 1992;
        calculationYear(year);

        int clientOS = 1;
        detectionSoftVersion(clientOS);

        int deliveryDistance = 10;
        System.out.println(deliveriCard(deliveryDistance) + " день(я) примерный срок доставка карты!");



    }
}