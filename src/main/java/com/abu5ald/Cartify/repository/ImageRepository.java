package com.abu5ald.Cartify.repository;

import com.abu5ald.Cartify.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
