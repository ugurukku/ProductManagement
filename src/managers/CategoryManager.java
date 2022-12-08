package managers;

import entities.Category;

import services.BaseService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class CategoryManager implements BaseService<Category> {

    static List<Category> categories = Arrays.asList(
            new Category(1, "Koynek"),
            new Category(2, "Ayaqqabi"),
            new Category(3, "Cuzdan"));

    @Override
    public Category getById(int id) {

        AtomicReference<Category> _category = new AtomicReference<>();

        categories.forEach(category -> {
            if (category.getId() == id) {
                _category.set(category);
            }
        });
        return _category.get();
    }

    @Override
    public List<Category> getAll() {
        return categories;
    }

    @Override
    public void deleteById(int id) {

        AtomicReference<Category> deletingCategory = new AtomicReference<>();

        categories.forEach(category -> {
            if (category.getId() == id) {
                deletingCategory.set(category);
            }
        });

        categories.remove(deletingCategory.get());

    }
}
