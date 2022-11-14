package web.models;
import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String producer;
    @Column
    private String model;

    public Car(){
    }

    public Car(String producer, String model){
        this.producer = producer;
        this.model = model;
    }

    public Car(long id, String producer, String model) {
        this(producer, model);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }


    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
