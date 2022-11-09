package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import web.DAO.CarDAO;
import web.models.Car;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Component
@Service
public class CarServiseImpl implements CarService {
    //@Autowired
    @PersistenceContext
    private EntityManager entityManager;



    public CarServiseImpl(){

        gen5();
    }

    @Override
    @Transactional
    public void setCar(Car car) {
        entityManager.getTransaction().begin();
        entityManager.persist(car);
        entityManager.getTransaction().commit();
    }

    @Override
    @Transactional
    public List<Car> getCars() {
        List<Car> carList = entityManager.createQuery("SELECT Car from Car", Car.class).getResultList();
        return carList;
    }

    @Override
    @Transactional
    public List<Car> getCars(int count) {
        int limit = Math.min(count, 5);
        return getCars().stream().limit(limit).toList();
    }

    @Override
    @Transactional
    public void gen5() {
        for (int i =0; i<5; i++) {
            setCar(new Car(i,"Producer_"+i, "Model_"+i));
        }
    }


}
