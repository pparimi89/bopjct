package backoffice.domain;

import lombok.Data;

@Data
public class ExpenseRequest {

    private Float cost;
    private String expenseCategoryName;
    private String vendorCategoryName;
    private String madeOn; //
    private String paymentMode;
    private Float paymentAmount;
    private String notes;
    private Long tentId;
    private String bankName;
    private String type;

    private String fromDate;
    private String toDate;



}
