package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CaaServiceImp implements CaaService {

    @Override
    public List<Car> get(Integer x, List<Car> cars) {

        if (x == null || x >= 5) {
            x = 5;
        }
        List<Car> f = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            f.add(cars.get(i));
        }
        return f;
    }

    @Override
    public List<Car> createCar() {
        List<Car> k = new ArrayList<>();
        k.add(new Car(100, "Geely", 1l));
        k.add(new Car(200, "Zanella", 2l));
        k.add(new Car(300, "Puch", 3l));
        k.add(new Car(400, "Hongqi", 4l));
        k.add(new Car(500, "skoda", 5l));

        return k;
    }
}
