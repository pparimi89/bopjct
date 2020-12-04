package backoffice.domain;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class CategoryRequest {

    @NonNull
    private String name;

    @NonNull
    private String key;

    @NonNull
    private String type;
}
