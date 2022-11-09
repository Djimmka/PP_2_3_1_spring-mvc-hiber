//package web.DAO;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//import web.models.Car;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.ArrayList;
//import java.util.List;
//@Repository
//public class CarDaoImpl implements CarDAO{
////    @PersistenceContext
////    EntityManager entityManager;
//
//
//    private List<Car> cars;
//
//    public CarDaoImpl(){
////        cars = new ArrayList<>();
////        for (int i =0; i<5; i++) {
////            cars.add(new Car(i,"Producer_"+i, "Model_"+i));
////        }
//    }
//
//    @Override
//    public Car getCar(int id) {
//        return entityManager.find(Car.class, id);
//    }
//
//    @Override
//    public void setCar(Car car) {
//        entityManager.getTransaction().begin();
//        entityManager.persist(car);
//        entityManager.getTransaction().commit();
//    }
//
//    @Override
//    public List<Car> getCars() {
//        List<Car> carList = entityManager.createQuery("SELECT Car from Car", Car.class).getResultList();
//        return carList;
//    }
//
//    @Override
//    public List<Car> getCarsNumbered(int count) {
//        int limit = Math.min(count, 5);
//        return getCars().stream().limit(limit).toList();
//    }
//}
