package com.example.collectiontest.model.reqest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TestCollectionMethodRequest {

    /**
     * Название класса
     */
    @JsonProperty("Collection")
    @NotNull(message = "Поле Collection не может быть пустым")
    private String collection;

    /**
     * Название метода
     */
    @JsonProperty("Method")
    @NotNull(message = "Поле Method не может быть пустым")
    private String method;

    /**
     * Количество объектов в коллекции перед началом тестирования
     */
    @JsonProperty("StartObjectsQuantity")
    private Long afterStartObjectsQuantity;

    /**
     * Количество повторений
     */
    @JsonProperty("Iterations")
    private Long iterations;
}