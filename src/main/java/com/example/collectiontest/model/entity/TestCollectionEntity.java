package com.example.collectiontest.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TEST_COLLECTIONS")
public class TestCollectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TC_ID")
    private Long id;


    @NotNull(message = "Не заполнено поле TC_Collection")
    @Column(name = "TC_Collection")
    private String collection;

    @NotNull(message = "Не заполнено поле TC_Method")
    @Column(name = "TC_Method")
    private String method;

    @NotNull(message = "Не заполнено поле TC_Time")
    @Column(name = "TC_Time")
    private Long time;

    @NotNull(message = "Не заполнено поле TC_Iterations")
    @Column(name = "TC_Iterations")
    private Long iterations;

    @Column(name = "TC_Start_items_quantity")
    private Long startItemsQuantity;

    @Column(name = "TC_Description")
    private Long description;

}
