package guru.springframework.controllers;

import guru.springframework.model.UnitOfMeasure;

import java.math.BigDecimal;

public class IngredientCommand {
    private String id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasure unitOfMeasure;
}
