package kg.neobis.part3.controller;

import kg.neobis.part3.model.dto.ProductDTO;
import kg.neobis.part3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/save")
    public ProductDTO saveProduct(@RequestBody ProductDTO productDTO){
        return productService.saveProduct(productDTO);
    }
    @GetMapping("/findById")
    public ProductDTO findById(@RequestParam Long id){
        return productService.findById(id);
    }
    @GetMapping("/findAll")
    public List<ProductDTO> findAll(){
        return productService.findAll();
    }

    @PutMapping("/update")
    public ProductDTO updateProduct(@RequestBody ProductDTO productDTO){
        return productService.update(productDTO);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
        productService.deleteProduct(id);
    }

}
