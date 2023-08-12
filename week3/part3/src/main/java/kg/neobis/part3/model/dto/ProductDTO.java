package kg.neobis.part3.model.dto;

import kg.neobis.part3.model.Basket;
import kg.neobis.part3.model.Category;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDTO {
    Long id;
    String name;
    Double weight;
    String description;
    Integer quantity;
    Boolean isAvailable;
    Category category;
    Basket basket;

}
