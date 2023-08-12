package kg.neobis.part3.mapper;

import kg.neobis.part3.model.Product;
import kg.neobis.part3.model.dto.ProductDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductDTO toDto(Product product);
    Product toEntity(ProductDTO productDTO);
    List<ProductDTO> toDTOList(List<Product> productList);
    List<Product> toEntityList(List<ProductDTO> productDTOList);
}
