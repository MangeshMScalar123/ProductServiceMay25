package com.fakestoredev.fakestoreproductservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String name;
    private String description;
    private String title;
    private String image;
    private String price;
    private String category;

}
