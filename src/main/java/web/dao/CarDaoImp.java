package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private  List<Car> cars = new ArrayList<>();


    {
       cars.add(new Car("BMW", 2004));
       cars.add(new Car("Lexus", 2012));
       cars.add(new Car("Lada", 2019));
       cars.add(new Car("Opel", 2008));
       cars.add(new Car("Niva", 2001));

    }

    @Override
    public  List<Car> carList(int count) {
        if (count > 0 & count <= cars.size()) {
            return cars.subList(0, count);
        }
        return cars;
    }

}
