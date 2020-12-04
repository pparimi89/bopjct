package backoffice.web.expenses;

import com.aidiva.backoffice.domain.Category;
import com.aidiva.backoffice.domain.CategoryRequest;
import com.aidiva.backoffice.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryServiceImpl categoryServiceImpl;

    @GetMapping("/categories/{type}")
    public ResponseEntity<List<Category>> getCategories(@PathVariable String type){
        List<Category> categories = categoryServiceImpl.getAllCategories(type);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping("/category")
    public ResponseEntity<Object> createCategory(@RequestBody final CategoryRequest request){
        categoryServiceImpl.addCategory(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
