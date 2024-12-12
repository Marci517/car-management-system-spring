package edu.bbte.idde.bmim2214.business;

import edu.bbte.idde.bmim2214.business.exceptions.CarExceptionDates;
import edu.bbte.idde.bmim2214.dataaccess.exceptions.CarExceptionDatabase;
import edu.bbte.idde.bmim2214.dataaccess.model.CarModel;

import java.util.List;

public interface CarService {
    void addCar(CarModel car) throws CarExceptionDatabase, CarExceptionDates;

    void deleteCar(int id) throws CarExceptionDatabase;

    void updateCar(CarModel car) throws CarExceptionDatabase, CarExceptionDates;

    CarModel getCar(int id) throws CarExceptionDatabase;

    List<CarModel> getAllCars() throws CarExceptionDatabase;

    List<CarModel> getAllCarsFromSpecYear(int year) throws CarExceptionDatabase;

}
