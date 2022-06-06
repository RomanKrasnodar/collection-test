package com.example.collectiontest.repository;

import com.example.collectiontest.model.entity.TestCollectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCollectionRepository extends JpaRepository<TestCollectionEntity, Long> {
}
