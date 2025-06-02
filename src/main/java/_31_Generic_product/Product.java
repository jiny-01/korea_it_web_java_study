package _31_Generic_product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product<T> {

    private String productName;
    private T productInfo;

    @Override
    public String toString() {
        return productName + productInfo;
    }


}
