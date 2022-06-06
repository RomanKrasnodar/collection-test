package com.example.collectiontest.model.reqest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
    @NotNull(message = "Поле Iterations не может быть пустым")
    private Long iterations;
}