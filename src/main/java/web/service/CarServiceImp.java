package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> cars = List.of(
            new Car("model1", "series1", 1990),
            new Car("model2", "series2", 1995),
            new Car("model3", "series3", 2000),
            new Car("model4", "series4", 2005),
            new Car("model5", "series5", 2010));

    @Override
    public List<Car> getCars(int countCars) {
        if (countCars >= 5) {
            return cars;
        } else {
            return cars.subList(0, countCars);
        }
    }
}
