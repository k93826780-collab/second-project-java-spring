package pl.edu.vistula.second_project_java_spring.product.support;

import org.springframework.stereotype.Component;
import pl.edu.vistula.second_project_java_spring.product.api.request.ProductRequest;
import pl.edu.vistula.second_project_java_spring.product.api.response.ProductResponse;
import pl.edu.vistula.second_project_java_spring.product.domain.Product;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        return product;
    }

    public ProductResponse toResponse(Product product) {
        ProductResponse response = new ProductResponse();
        response.setId(product.getId());
        response.setName(product.getName());
        return response;
    }
}
