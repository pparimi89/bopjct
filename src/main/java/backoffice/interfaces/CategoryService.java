package backoffice.interfaces;

import com.aidiva.backoffice.domain.Category;
import com.aidiva.backoffice.domain.CategoryRequest;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories(String categoryType);

    void addCategory(CategoryRequest request);
}
