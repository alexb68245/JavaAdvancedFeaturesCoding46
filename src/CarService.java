import java.util.ArrayList;
import java.util.List;

public class CarService {

    private List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
        System.out.println(car.getName() + " added");
    }

    public void remove(Car car){
        cars.remove(car);
        System.out.println(car.getName() + " removed");
    }

    public List<Car> getCars(){
        return cars;
    }

    public List<Car> getCarsByEngineV12(){
        List<Car> carsWithV12 = new ArrayList<>();
        for (Car car : cars){
            if (car.getEngineType().equals(EngineType.V12)){
                carsWithV12.add(car);
            }
        }
        return carsWithV12;
    }

    public List<Car> getCarsBefore1999(){
        List<Car> carsBefore1999 = new ArrayList<>();
        for (Car car : cars){
            if (car.getYearOfManufacture() <= 1999){
                carsBefore1999.add(car);
            }
        }
        return carsBefore1999;
    }

    public Car getMostExpensiveCar(){
        Car mostExpensiveCar = new Car();
        for (Car car : cars){
            if (car.getPrice() > mostExpensiveCar.getPrice()){
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Car getCheapestCar(){
        Car cheapestCar = new Car();
        cheapestCar.setPrice(getMostExpensiveCar().getPrice());
        for (Car car : cars){
            if (car.getPrice() < cheapestCar.getPrice()){
                cheapestCar = car;
            }
        }
        return cheapestCar;
    }

    public Car carWithAtLeast3Manufacturers(){
        Car carWithAtLeast3Manufacturers = new Car();
        for (Car car : cars){
            if (car.getManufacturers().size() >= 3){
                carWithAtLeast3Manufacturers = car;
            }
        }
        return carWithAtLeast3Manufacturers;
    }

    public List<Car> sortByPrice(Sort sort){
        Car temp = new Car();
        if (sort.equals(Sort.ASCENDING)){
            for (int i = 0; i < cars.size(); i++){
                for (int j = i + 1; j < cars.size(); j++){
                    if (cars.get(i).getPrice() > cars.get(j).getPrice()){
                        temp = cars.get(i);
                        cars.get(i).object = cars.get(j);
                    }
                }
            }
        }

        else if (sort.equals(Sort.DESCENDING)){
            for (int i = 0; i < cars.size(); i++){
                for (int j = i + 1; j < cars.size(); j++){
                    if (cars.get(i).getPrice() < cars.get(j).getPrice()){
                        temp = cars.get(i);
                        cars.get(i).object = cars.get(j);
                    }
                }
            }
        }
        return cars;
    }

    public boolean ifExist(Car car){
        if (cars.contains(car)){
            return true;
        }else {
            return false;
        }
    }

    public List<Car> carsManufacturedBy(Manufacturer manufacturer){
        List<Car> carsManufacturedBy = new ArrayList<>();
        for (Car car : cars){
            if (car.getManufacturers().contains(manufacturer)){
                carsManufacturedBy.add(car);
            }
        }
        return carsManufacturedBy;
    }

    public List<Car> carsManufacturedByWithYear(Manufacturer manufacturer, int year, String operation){
        List<Car> cars = new ArrayList<>();
        switch (operation){
            case "<":
                for (Car car : carsManufacturedBy(manufacturer)){
                    if (manufacturer.getYearOfEstablishment() < year){
                        cars.add(car);
                    }
                }
                break;
            case ">":
                for (Car car : carsManufacturedBy(manufacturer)){
                    if (manufacturer.getYearOfEstablishment() > year){
                        cars.add(car);
                    }
                }
                break;
            case "<=":
                for (Car car : carsManufacturedBy(manufacturer)){
                    if (manufacturer.getYearOfEstablishment() <= year){
                        cars.add(car);
                    }
                }
                break;
            case ">=":
                for (Car car : carsManufacturedBy(manufacturer)){
                    if (manufacturer.getYearOfEstablishment() >= year){
                        cars.add(car);
                    }
                }
                break;
            case "=":
                for (Car car : carsManufacturedBy(manufacturer)){
                    if (manufacturer.getYearOfEstablishment() == year){
                        cars.add(car);
                    }
                }
                break;
            case "!=":
                for (Car car : carsManufacturedBy(manufacturer)){
                    if (manufacturer.getYearOfEstablishment() != year){
                        cars.add(car);
                    }
                }
                break;
        }
        return cars;
    }
}
