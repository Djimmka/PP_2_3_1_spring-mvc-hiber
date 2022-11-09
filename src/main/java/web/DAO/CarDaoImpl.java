package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDAO{

    private List<Car> cars;

    public CarDaoImpl(){
        cars = new ArrayList<>();
        for (int i =0; i<5; i++) {
            cars.add(new Car(i,"Producer_"+i, "Model_"+i));
        }

    }

    @Override
    public Car getCar(int id) {

        return cars.get(id);
    }

    @Override
    public void setCar(Car car) {

    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsNumbered(int count) {
        int limit = Math.min(count, 5);
        return cars.stream().limit(limit).toList();
    }
}
