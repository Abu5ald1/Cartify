package com.abu5ald.Cartify.service.product;

import com.abu5ald.Cartify.model.Product;
import com.abu5ald.Cartify.request.AddProductRequest;
import com.abu5ald.Cartify.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    void deleteProduct(Long id);

    Product getProductById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByName(String name);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);

}
