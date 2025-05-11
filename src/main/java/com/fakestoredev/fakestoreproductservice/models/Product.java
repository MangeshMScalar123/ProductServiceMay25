package com.fakestoredev.fakestoreproductservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{
    private String title;
    private String description;
    private String price;
    private String imageUrl;
    private String category;
}
