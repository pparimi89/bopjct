package backoffice.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "tbl_mast_drug_catalog")
@Data
public class DrugCatalog {

    @Id
    @Column(name = "mast_drug_catalog_id", nullable = false)
    private Long mastDrugCatalogId;

    @Column(name = "mast_drug_category_id")
    private Long mastDrugCategoryId;

    @Column(name = "mast_drug_brand_id")
    private Long mastDrugBrandId;

    @Column(name = "tent_id")
    private Long tentId;

    @Column(name = "drug_name", nullable = false)
    private String drugName;

    @Column(name = "drug_type", nullable = false)
    private String drugType;

    @Column(name = "drug_strength", nullable = false)
    private String drugStrength;

    @Column(name = "drug_unit", nullable = false)
    private String drugUnit;

    @Column(name = "drug_instruction", nullable = false)
    private String drugInstruction;

    @Column(name = "drug_status")
    private Boolean drugStatus;

    @Column(name = "created_on")
    private String createdOn;

    @Column(name = "created_by", nullable = false)
    private Integer createdBy;

    @Column(name = "modified_on")
    private String modifiedOn;

    @Column(name = "modified_by")
    private Long modifiedBy;
}