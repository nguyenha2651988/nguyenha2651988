package test_heroku.controller;

import test_heroku.model.Category;
import test_heroku.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/list")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<Iterable<Category>> showListCategory() {
        System.out.println("ok");
        try {
            Iterable<Category> listCategory = categoryService.findAllCategory();
            System.out.println(listCategory);
            return new ResponseEntity<Iterable<Category>>(listCategory, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity addCategory(@RequestBody Category category) {
        categoryService.save(category);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
           try {
               Optional<Category> category = categoryService.findById(id);
               return new ResponseEntity<Category>(category.get(), HttpStatus.OK);
        }
           catch (Exception e) {
               return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
           }
    }

    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestBody Category category) {
        categoryService.delete(category.getId());
        return new ResponseEntity(HttpStatus.OK);
    }

}
