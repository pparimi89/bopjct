package backoffice.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_mast_drug_band")
@Data
public class DrugBand {

    @Id
    @Column(name = "mast_drug_brand_id", nullable = false)
    private Long mastDrugBrandId;

    @Column(name = "tent_id")
    private Integer tentId;

    @Column(name = "drug_brand_name", nullable = false)
    private String drugBrandName;

    @Column(name = "drug_brand_desc")
    private String drugBrandDesc;

    @Column(name = "created_on")
    private String createdOn;

    @Column(name = "created_by", nullable = false)
    private Integer createdBy;

    @Column(name = "modified_on")
    private String modifiedOn;

    @Column(name = "modified_by")
    private Integer modifiedBy;
}