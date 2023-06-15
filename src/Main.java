import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.SAT;
        System.out.println(weekDay);

        System.out.println("-".repeat(35));

        var allDays = DayOfTheWeek.values();
        System.out.println(Arrays.toString(allDays));

        System.out.println("-".repeat(35));

        for(int i=0;i<10;i++){
            weekDay = getRandomDay();
            System.out.printf("Name is %s, Ordinal Value = %d%n",weekDay.name(),weekDay.ordinal());

            if(weekDay == DayOfTheWeek.SAT){
                System.out.println("Found a Saturday!!!");
            }
        }

        System.out.println("-".repeat(35));
        for(int i=0;i<10;i++){
            weekDay = getRandomDay();
            switchDayOfTheWeek(weekDay);
        }


        System.out.println("-".repeat(35));

        
        for(Topping topping : Topping.values()){
            System.out.println(topping.name()+  " : " + topping.getPrice());
        }



    }

    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7); // 0-6
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }

    public static void switchDayOfTheWeek(DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal()+1;
        switch (weekDay){
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    "day is Day "+ weekDayInteger );
        }
    }
}

