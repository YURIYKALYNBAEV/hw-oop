import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {
        Car ladaGranta = new Car("Lada", "Granta", 2015, "Россия", "желтый", 90,
                1.7, "автомат", "седан", "А123АА123",5,
                true,new Car.Key(false,false));
        System.out.println(ladaGranta);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный",
                90, 3.0, "автомат", "седан", "А123АА123",
                5,true,new Car.Key(false,false));
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 90,
                3.0, "автомат", "А123АА123", "А123АА123",5,
                true,new Car.Key(false,false));
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный",
                90, 2.4, "автомат", "хетчбек", "Б456ББ193",
                5,true,new Car.Key(false,false));
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый",
                90, 1.6, "автомат", "седан", "В789ВВ193",
                5,true,new Car.Key(false,false));
        System.out.println(hyundai);

        Bus paz = new Bus("ПАЗ", "ПАЗ-4234", 2023, "Россия", "белый", 70);
        System.out.println("paz = " + paz);
        Bus kavz = new Bus("КАВЗ", "КАВЗ-4270", 2023, "Россия", "белый", 70);
        System.out.println("kavz = " + kavz);
        Bus liaz = new Bus("ЛИАЗ", "ЛИАЗ-5292 РЕСТАЙЛИНГ", 2023, "Россия", "синий",
                70);
        System.out.println("liaz = " + liaz);
    }

}