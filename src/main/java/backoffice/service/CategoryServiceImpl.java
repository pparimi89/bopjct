package backoffice.service;

import com.aidiva.backoffice.domain.Category;
import com.aidiva.backoffice.domain.CategoryRequest;
import com.aidiva.backoffice.entity.MastLookup;
import com.aidiva.backoffice.interfaces.CategoryService;
import com.aidiva.backoffice.respositories.MasterLookupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.aidiva.backoffice.util.BackOfficeUtil.getCurrentDate;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    MasterLookupRepository masterLookupRepository;

    @Override
    public List<Category> getAllCategories(final String categoryType) {
        final List<MastLookup> masterLookupCategories = masterLookupRepository.findByMastLookupType(categoryType);
        return masterLookupCategories.stream()
                .map(masterLookupCategory -> {
                    final Category category = new Category();
                    category.setCategoryId(masterLookupCategory.getMastTentId());
                    category.setValue(masterLookupCategory.getMastLookupValue());
                    category.setKey(masterLookupCategory.getMastLookupKey());
                    category.setType(masterLookupCategory.getMastLookupType());
                    return category;
                })
                .collect(Collectors.toList());
    }

    @Override
    public void addCategory(final CategoryRequest request) {
        final MastLookup mastLookup = new MastLookup();
        mastLookup.setMastLookupValue(request.getName());
        mastLookup.setMastLookupKey(request.getKey());
        mastLookup.setMastTentId(1L);
        mastLookup.setMastLookupType(request.getType());
        mastLookup.setCreatedBy(1111L);
        mastLookup.setCreatedOn(getCurrentDate());
        masterLookupRepository.save(mastLookup);
    }

}
