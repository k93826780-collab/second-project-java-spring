package pl.edu.vistula.second_project_java_spring.product.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.vistula.second_project_java_spring.product.api.request.ProductRequest;
import pl.edu.vistula.second_project_java_spring.product.api.response.ProductResponse;
import pl.edu.vistula.second_project_java_spring.product.service.ProductService;
import java.util.NoSuchElementException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;
    @PostMapping
    public ResponseEntity<ProductResponse> create(
            @RequestBody ProductRequest request
    ) {
        ProductResponse response = service.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping("/{id}")
    public ProductResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Void> handleNotFound() {
        return ResponseEntity.notFound().build();
    }
    @GetMapping
    public List<ProductResponse> getAll() {
        return service.getAll();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ProductResponse update(
            @PathVariable Long id,
            @RequestBody ProductRequest request
    ) {
        return service.update(id, request);
    }
}