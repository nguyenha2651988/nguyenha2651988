package test_heroku.service.impl;

import test_heroku.model.Category;
import test_heroku.repository.CategoryRepository;
import test_heroku.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void delete(Category category) {

    }

    @Override
    public Optional<Category> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Category> findAllCategory() {
        return categoryRepository.findAll();
    }
}
