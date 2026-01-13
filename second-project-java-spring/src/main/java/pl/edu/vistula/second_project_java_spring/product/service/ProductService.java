package pl.edu.vistula.second_project_java_spring.product.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.second_project_java_spring.product.api.request.ProductRequest;
import pl.edu.vistula.second_project_java_spring.product.api.response.ProductResponse;
import pl.edu.vistula.second_project_java_spring.product.domain.Product;
import pl.edu.vistula.second_project_java_spring.product.repository.ProductRepository;
import pl.edu.vistula.second_project_java_spring.product.support.ProductMapper;
import java.util.NoSuchElementException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductResponse create(ProductRequest request) {
        Product product = mapper.toProduct(request);
        Product saved = repository.save(product);
        return mapper.toResponse(saved);
    }
    public ProductResponse getById(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Product not found"));
        return mapper.toResponse(product);
    }
    public List<ProductResponse> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    public ProductResponse update(Long id, ProductRequest request) {
        Product updated = mapper.toProduct(request);
        Product product = repository.update(id, updated);
        return mapper.toResponse(product);
    }
}
