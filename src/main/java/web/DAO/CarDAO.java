package web.DAO;

import web.models.Car;

import java.util.List;

public interface CarDAO {
    public Car getCar(int id);
    public void setCar(Car car);
    public List<Car>  getCars();

    public List<Car>  getCarsNumbered(int count);
}
