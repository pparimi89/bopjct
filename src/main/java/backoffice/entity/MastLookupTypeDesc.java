package backoffice.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_mast_lookup_type_desc")
@Data
public class MastLookupTypeDesc {

    @Id
    @Column(name = "mast_lookup_type", nullable = false)
    private String mastLookupType;

    @Column(name = "mast_lookup_type_desc")
    private String mastLookupTypeDesc;

    @Column(name = "mast_lookup_type_tent_ediable")
    private Boolean mastLookupTypeTentEdiable;

}