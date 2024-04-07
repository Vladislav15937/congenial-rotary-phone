package web.service;

import web.model.Car;
import java.util.List;

public interface CaaService {

    List<Car> get(Integer x, List<Car> cars);

    List<Car> createCar();
}
