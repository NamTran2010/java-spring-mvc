package vn.namtran.laptopshop.service.specification;

import org.springframework.data.jpa.domain.Specification;

import vn.namtran.laptopshop.domain.Product;
import vn.namtran.laptopshop.domain.Product_;

public class ProductSpecs {
    public static Specification<Product> nameLike(String name) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get(Product_.NAME), "%" + name + "%");
    }

}
