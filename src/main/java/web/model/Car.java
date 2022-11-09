package web.model;

public class Car {
    private String producer;
    private String model;
    private long series;

    public Car(){
    }

    public Car(String producer, String model, long series){
        this.producer = producer;
        this.series = series;
        this.model = model;
    }


}
