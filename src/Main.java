import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int sleepPenalty = 8;
        int totalHours = 48;

        int timeWeHave = totalHours - 2*sleepPenalty;
        int points = 0;

        List<Spot> spots = Spot.getSpots();

        spots.sort(Comparator.comparingDouble(Spot::getDensity).reversed()); //Сортируем по плотности важности места (сколько очков важности мы получаем за час пребывания там)

        System.out.println("Едем зарабатывать очки важности\n");
        for(Spot spot : spots){
            if(timeWeHave - spot.time < 0){
                System.out.println("В "+spot.name+" не успеем");
                continue;
            }
            timeWeHave -= spot.time;
            if(timeWeHave < 0){
                System.out.println("Времени не осталось, уезжаем.");
                break;
            }
            points += spot.importance;
            System.out.println(spot.name+"\n\t\tПлотность: "+spot.getDensity()+"\n\t\tСтоимость по времени: "+spot.time+" ч\n\t\t\tОсталось времени: "+timeWeHave+" ч\n\t\t\tВсего очков важности: "+points+"\n");
        }

        System.out.println("\nОчков важности набрано: "+points);
    }
}