package com.jon.darazz.api;

import com.jon.darazz.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductAPI {
    @GET("products")
    Call<List<Product>> getProduct();
}
