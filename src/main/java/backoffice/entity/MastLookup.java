package backoffice.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "tbl_mast_lookup")
@Data
public class MastLookup implements Serializable {

    @Id
    @Column(name = "mast_lookup_key", nullable = false)
    private String mastLookupKey;

    @Column(name = "mast_lookup_value", nullable = false)
    private String mastLookupValue;

    @Column(name = "mast_lookup_type", nullable = false)
    private String mastLookupType;

    @Column(name = "mast_tent_id", nullable = false)
    private Long mastTentId;

    @Column(name = "created_by", nullable = false)
    private Long createdBy;

    @Column(name = "created_on")
    private Timestamp createdOn;

    @Column(name = "modified_by")
    private Long modifiedBy;

    @Column(name = "modified_on")
    private Timestamp modifiedOn;

}