package managers;

import entities.Brand;

import entities.Category;
import services.BaseService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class BrandManager implements BaseService<Brand> {

  static   List<Brand> brands = Arrays.asList(
            new Brand(1, "Nike"),
            new Brand(2, "Adidas"),
            new Brand(3, "Trendyol"),
            new Brand(4, "Alibaba"));

    @Override
    public Brand getById(int id) {

        AtomicReference<Brand> _brand = new AtomicReference<>();

        brands
                .forEach(brand -> {
                    if (brand.getId() == id){
                        _brand.set(brand);
                    }
                });
        return _brand.get();
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }

    @Override
    public void deleteById(int id) {

        AtomicReference<Brand> deletingBrand = new AtomicReference<>();

        brands.forEach(brand -> {
            if (brand.getId() == id) {
                deletingBrand.set(brand);
            }
        });

        brands.remove(deletingBrand.get());

    }
}
