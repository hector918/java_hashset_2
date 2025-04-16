package org.example; // Make sure this matches your package

import java.util.*;

public class CarService {

    private final Set<Car> carList;

    public CarService(){
        this.carList = new HashSet<>();
    }

    public void addCar(Car car){
        if(car == null){
            throw new IllegalArgumentException("car can not be null.");
        }

        carList.add(car);
    }
    public boolean removeCar(Car car){
        try{
            if(car == null){
                throw new IllegalArgumentException("car can not be null.");
            }

            if(carList.contains(car)){
                carList.remove(car);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            System.out.println(e.toString());
            return false;
        }
    }

    public int getCarCount(){
        return carList.size();
    }

    public Set<Car> getCarsByMake(String brand){
        if(brand == null){
            throw new IllegalArgumentException("Brand can not be null.");
        }

        if(brand.isEmpty()){
            throw new IllegalArgumentException("Brand can not be empty.");
        }

        Set<Car> ret = new HashSet<>();
        for(Car car : this.carList){
            if(car.getBrand().equalsIgnoreCase(brand)){
                ret.add(car);
            }
        }
        return ret;
    }
}