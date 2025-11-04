package com.abu5ald.Cartify.repository;

import com.abu5ald.Cartify.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    public Category findByName(String name);

    boolean existsByName(String name);
}
