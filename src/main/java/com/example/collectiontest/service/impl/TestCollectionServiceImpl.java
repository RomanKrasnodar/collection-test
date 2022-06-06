package com.example.collectiontest.service.impl;

import com.example.collectiontest.model.entity.TestCollectionEntity;
import com.example.collectiontest.model.reqest.TestCollectionMethodRequest;
import com.example.collectiontest.repository.TestCollectionRepository;
import com.example.collectiontest.service.TestCollectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class TestCollectionServiceImpl implements TestCollectionService {

    private final TestCollectionRepository repository;


    @Override
    public String testCollection(TestCollectionMethodRequest request) {

        return getAndTestCollection(request);
    }


    private String getAndTestCollection(TestCollectionMethodRequest request) {
        String collectionName = request.getCollection();

        switch (collectionName) {

            case "HashSet": return addNumbersDefault(new HashSet(), request.getIterations(), HashSet.class);
            case "ArrayList": return addNumbersDefault(new ArrayList(), request.getIterations(), ArrayList.class);
            default: return "ПНХ";
        }
    }


    private String addNumbersDefault(Collection collection, Long iterations, Class clazz) {
        Date begin = new Date();

        for (long i = 0; i < iterations; i++) {
            collection.add(i);
        }

        Date end = new Date();

        long executionTime = end.getTime() - begin.getTime();

        saveStatistic(clazz.getSimpleName(), "Добавление Long в коллекцию", executionTime, iterations, 0L, "Время в миллисекундах");


        return format("Время операции: %s миллисекунд", executionTime);

    }

    private void saveStatistic(String collection, String method, Long executionTime, Long iterations, Long startItemsQuantity, String description) {
        var statistics = TestCollectionEntity.builder()
                .collection(collection)
                .method(method)
                .time(executionTime)
                .iterations(iterations)
                .startItemsQuantity(startItemsQuantity)
                .description(description)
                .build();


        repository.save(statistics);
    }
}