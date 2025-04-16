package org.example; // Make sure this matches your package

import java.util.Objects; // For equals() and hashCode()

public class Car {
    private final String model, brand;
    public Car(String model, String brand){
        if(model.isEmpty()){
            throw new IllegalArgumentException("model can not be empty.");
        }else{
            this.model = model;
        }

        if(brand.isEmpty()){
            throw new IllegalArgumentException("brand can not be empty.");
        }else{
            this.brand = brand;
        }
    }

    public String getModel(){
        return this.model;
    }

    public String getBrand(){
        return this.brand;
    }
}