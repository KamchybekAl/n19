package kg.neobis.part3.service;

import kg.neobis.part3.model.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    ProductDTO saveProduct (ProductDTO productDTO);
    ProductDTO findById(Long id);
    List<ProductDTO>findAll();
    ProductDTO update(ProductDTO productDTO);
    void deleteProduct(Long id);
}
