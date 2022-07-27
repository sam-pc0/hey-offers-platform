package platform.product.service;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import platform.product.entity.ProductEntity;
import platform.product.repository.ProductRepository;

import java.util.List;

/**
 * @author sam-pc
 */

@NoArgsConstructor
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public void  createProduct(ProductEntity product) {
        productRepository.save(product);
    }
}
