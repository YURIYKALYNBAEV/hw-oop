import transport.Car;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия",
                "автомат", "седан", "А123АА123", 5,true,
                new Car.Key(false,false));
        System.out.println(ladaGranta);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,
                "Германия", "механика", "хетчбек", "А123АА123", 5,
                true,new Car.Key(false,false));
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия",
                "автомат", "кабриолет", "А123АА123", 3,true,
                new Car.Key(false,false));
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018,
                "Южная Корея", "автомат", "седан", "Б456ББ193", 5,
                true,new Car.Key(false,false));
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея", "механика", "автомат", "В789ВВ193", 5,
                true,new Car.Key(false,false));
        System.out.println(hyundai);
    }

}