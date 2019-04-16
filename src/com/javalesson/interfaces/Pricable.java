package com.javalesson.interfaces;

public interface Pricable extends Deliverable, Orderable {

    default int calPrice(){
        return calcOrderPrice() + calcDeliveryPrice();
    }

}
