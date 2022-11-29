package com.example.taconandofullstack.models;

import java.util.List;

public class Menu {
    private short id;
    private String item;
    private float price;
    private boolean special;
    private float specialPrice;
    private List<Ingredient> ingredients;
    private boolean inStock;
}
