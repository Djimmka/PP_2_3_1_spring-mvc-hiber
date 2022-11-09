package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.models.Car;

import java.util.List;
@Component
@Service

public class CarServiseImpl implements CarService {
    @Autowired
    private CarDAO carDAO;

    @Override
    public void setCar(Car car) {
        carDAO.setCar(car);
    }

    @Override
    public List<Car> getCars() {
        return carDAO.getCars();
    }

    @Override
    public List<Car> getCars(int count) {
        return carDAO.getCarsNumbered(count);
    }
}
