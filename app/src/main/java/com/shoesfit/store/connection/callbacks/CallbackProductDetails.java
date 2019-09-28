package com.shoesfit.store.connection.callbacks;

import com.shoesfit.store.model.Product;

import java.io.Serializable;

public class CallbackProductDetails implements Serializable {

    public String status = "";
    public Product product = null;

}
