package backoffice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_mast_drug_category")
@Data
public class DrugCategory {


    @Id
    @Column(name = "mast_drug_category_id", nullable = false)
    private Long mastDrugCategoryId;

    @Column(name = "tent_id")
    private Long tentId;

    @Column(name = "drug_category_name", nullable = false)
    private String drugCategoryName;

    @Column(name = "drug_category_desc")
    private String drugCategoryDesc;


    @Column(name = "drug_category_status")
    private Boolean drugCategoryStatus;

    @Column(name = "created_on")
    private String createdOn;

    @Column(name = "created_by", nullable = false)
    private Long createdBy;

    @Column(name = "modified_on")
    private String modifiedOn;

    @Column(name = "modified_by")
    private Integer modifiedBy;
}