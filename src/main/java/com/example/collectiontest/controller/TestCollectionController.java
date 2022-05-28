package com.example.collectiontest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/collection/test")
public class TestCollectionController {



    @PostMapping("test_collection_method")
    private ResponseEntity testMethodForCollection() {



        return ResponseEntity.ok("ok");
    }

}
