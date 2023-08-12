package kg.neobis.part3.service.impl;

import kg.neobis.part3.mapper.ProductMapper;
import kg.neobis.part3.model.Product;
import kg.neobis.part3.model.dto.ProductDTO;
import kg.neobis.part3.repository.ProductRepo;
import kg.neobis.part3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {
    private final ProductMapper productMapper;
    private final ProductRepo productRepo;

    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) {
        Product product = productMapper.toEntity(productDTO);
        Product save = productRepo.save(product);
        return productMapper.toDto(save);
    }

    @Override
    public ProductDTO findById(Long id) {
        return productMapper.toDto(productRepo.findById(id).get());
    }

    @Override
    public List<ProductDTO> findAll() {
        return productMapper.toDTOList(productRepo.findAll());
    }

    @Override
    public ProductDTO update(ProductDTO productDTO) {
        Product updateProduct = productRepo.findById(productDTO.getId()).get();
        updateProduct.setName(productDTO.getName());
        updateProduct.setWeight(productDTO.getWeight());
        updateProduct.setDescription(productDTO.getDescription());
        updateProduct.setQuantity(productDTO.getQuantity());
        updateProduct.setIsAvailable(productDTO.getIsAvailable());
        updateProduct.setCategory(productDTO.getCategory());
        return productMapper.toDto(updateProduct);
    }

    @Override
    public void deleteProduct(Long id) {
        Product deleteProduct = productRepo.findById(id).get();
        productRepo.delete(deleteProduct);
    }


}
