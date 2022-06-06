package com.example.collectiontest.controller;

import com.example.collectiontest.model.reqest.TestCollectionMethodRequest;
import com.example.collectiontest.service.TestCollectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/collection/test")
public class TestCollectionController {

    private final TestCollectionService service;

    @PostMapping("/test_collection_method")
    private ResponseEntity testMethodForCollection(@RequestBody @Validated TestCollectionMethodRequest request) {
        String response = service.testCollection(request);
        return ResponseEntity.ok(response);
    }

}
