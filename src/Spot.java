import java.util.ArrayList;
import java.util.List;

public class Spot {
    final String name;
    final double time;
    final int importance;
    final double density;
    public Spot(String name, double time, int importance) {
        this.name = name;
        this.time = time;
        this.importance = importance;
        density = importance/time;
    }

    public double getDensity(){ //добавил геттер для компаратора в main
        return density;
    }
    public static List<Spot> getSpots(){
        List<Spot> spots = new ArrayList<>();
        spots.add(new Spot("Исаакиевский собор",5,10));
        spots.add(new Spot("Эрмитаж",8,11));
        spots.add(new Spot("Кунсткамера",3.5,4));
        spots.add(new Spot("Петропавловская крепость",10,7));
        spots.add(new Spot("Ленинградский зоопарк",9,15));
        spots.add(new Spot("Медный всадник",1,17));
        spots.add(new Spot("Казанский собор",4,3));
        spots.add(new Spot("Спас на Крови",2,9));
        spots.add(new Spot("Зимний дворец Петра I",7,12));
        spots.add(new Spot("Зоологический музей",5.5,6));
        spots.add(new Spot("Музей обороны и блокады Ленинграда",2,19));
        spots.add(new Spot("Русский музей",5,8));
        spots.add(new Spot("Навестить друзей",12,20));
        spots.add(new Spot("Музей восковых фигур",2,13));
        spots.add(new Spot("Литературно-мемориальный музей Ф.М. Достоевского",4,2));
        spots.add(new Spot("Екатерининский дворец",1.5,5));
        spots.add(new Spot("Петербургский музей кукол",1,14));
        spots.add(new Spot("Музей микроминиатюры «Русский Левша»",3,18));
        spots.add(new Spot("Всероссийский музей А.С. Пушкина и филиалы",6,1));
        spots.add(new Spot("Музей современного искусства Эрарта",7,16));

        return spots;
    }
}