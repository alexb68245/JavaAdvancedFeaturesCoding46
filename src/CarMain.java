import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        Manufacturer bmw = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer volswagen = new Manufacturer("Volswagen", 1937, "Germany");
        Manufacturer benz = new Manufacturer("Benz", 1926, "Germany");
        Manufacturer ford = new Manufacturer("Ford", 1906, "United States");
        Manufacturer tesla = new Manufacturer("Tesla", 2003, "United States");
        Manufacturer ferrari = new Manufacturer("Ferrari", 1929, "Italy");
        List<Manufacturer> list1 = new ArrayList<Manufacturer>();
        list1.add(bmw);
        list1.add(volswagen);
        list1.add(benz);

        List list2 = new ArrayList<Manufacturer>();
        list2.add(tesla);

        List list3 = new ArrayList<Manufacturer>();
        list3.add(ferrari);
        list3.add(benz);

        List list4 = new ArrayList<Manufacturer>();
        list4.add(ford);
        list4.add(volswagen);
        Car car1 = new Car("first", "seria1", 2345678, 2006, list1, EngineType.V12);
        Car car2 = new Car("second", "seria2", 567876545, 2020, list2, EngineType.S3);
        Car car3 = new Car("third", "seria3", 234567806, 1998, list3, EngineType.V8);

        CarService service = new CarService();
        /* service.add(car1);
        service.add(car2);
        service.add(car3);
        service.remove(car1);
        service.add(car1);
        service.add(car3);

         */
        /*
        System.out.println("All cars: " + service.getCars());
        System.out.println("Cars with engine V12: " + service.getCarsByEngineV12());
        System.out.println("Car before 1999: "+ service.getCarsBefore1999());
        System.out.println("Most expensive car: " + service.getMostExpensiveCar().getName());
        System.out.println("Cheapest car: " + service.getCheapestCar().getName());
        System.out.println("Cars with 3 manufacturers: " + service.carWithAtLeast3Manufacturers());
        System.out.println(service.sortByPrice(Sort.ASCENDING));
        // **** System.out.println(service.sortByPrice(Sort.DESCENDING));
        System.out.println(service.ifExist(car1));
        System.out.println(service.carsManufacturedBy(benz));
        System.out.println(service.carsManufacturedByWithYear(benz, 1800, ">"));

         */

        System.out.println("Is Fiat premium? " + CarEnum.FIAT.isPremium());
        System.out.println("Is Porsche premium? " + CarEnum.PORSCHE.isPremium());
        System.out.println("Is Fiat regular? " + CarEnum.FIAT.isRegular());
        System.out.println("Is Ferrari faster than BMW? " + CarEnum.FERRARI.isFasterThan(CarEnum.BMW));
        CarEnum.PORSCHE.setPower(5678);
        System.out.println(CarEnum.PORSCHE.getPower());
    }
}
