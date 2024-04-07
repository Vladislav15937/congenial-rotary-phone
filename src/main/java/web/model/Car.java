package web.model;

public class Car {

    private int num;

    private String model;

    private Long id;

    public Car(int num, String model, Long id) {
        this.num = num;
        this.model = model;
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public String getModel() {
        return model;
    }

    public Long getId() {
        return id;
    }
}
