package pl.edu.vistula.second_project_java_spring.product.repository;

import org.springframework.stereotype.Repository;
import pl.edu.vistula.second_project_java_spring.product.domain.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

@Repository
public class ProductRepository {

    private final Map<Long, Product> database = new HashMap<>();
    private Long id = 0L;
    public Product save(Product product) {
        product.setId(++id);
        database.put(product.getId(), product);
        return product;
    }
    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(database.get(id));
    }
    public List<Product> findAll() {
        return new ArrayList<>(database.values());
    }
    public void deleteById(Long id) {
        if (!database.containsKey(id)) {
            throw new NoSuchElementException("Product not found");
        }
        database.remove(id);
    }
    public Product update(Long id, Product updated) {
        Product existing = database.get(id);
        if (existing == null) {
            throw new NoSuchElementException("Product not found");
        }

        existing.setName(updated.getName());
        return existing;
    }
}
