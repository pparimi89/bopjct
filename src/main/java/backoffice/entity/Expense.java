package backoffice.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tbl_tent_expenses")
@Data
public class Expense {

    @Id
    @Column(name = "tent_expense_id", nullable = false)
    private Long tentExpenseId;

    @Column(name = "tent_id", nullable = false)
    private Long tentId;

    @Column(name = "tent_expense_type", nullable = false)
    private String tentExpenseType;

    @Column(name = "tent_vendor_name")
    private String tentVendorName;

    @Column(name = "payment_mode", nullable = false)
    private String paymentMode;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "payment_ref_no")
    private String paymentRefNo;

    @Column(name = "payment_date", nullable = false)
    private String paymentDate;

    @Column(name = "payment_amount", nullable = false)
    private Float paymentAmount;

    @Column(name = "payment_status")
    private Boolean paymentStatus;

    @Column(name = "notes")
    private String notes;

    @Column(name = "is_recurring")
    private Boolean isRecurring;

    @Column(name = "is_cancelled")
    private Boolean isCancelled;

    @Column(name = "cancelled_date")
    private String cancelledDate;

    @Column(name = "created_by", nullable = false)
    private Long createdBy;

    @Column(name = "created_on")
    private Timestamp createdOn;

    @Column(name = "modified_by")
    private Long modifiedBy;

    @Column(name = "modified_on")
    private String modifiedOn;

}