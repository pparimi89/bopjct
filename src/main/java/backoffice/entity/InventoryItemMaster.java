package backoffice.entity;

import lombok.*;

import javax.persistence.*;


@Table(name = "tbl_tent_item_master")
@Data
public class InventoryItemMaster {

    @Id
    @Column(name = "tent_item_id", nullable = false)
    private Object tentItemId;

    @Column(name = "mast_category_id", nullable = false)
    private Integer mastCategoryId;

    @Column(name = "tent_id", nullable = false)
    private Integer tentId;

    @Column(name = "tent_item_name")
    private String tentItemName;

    @Column(name = "tent_item_code")
    private String tentItemCode;

    @Column(name = "tent_vendor_id", nullable = false)
    private Integer tentVendorId;

    @Column(name = "tent_item_stock_unit")
    private String tentItemStockUnit;

    @Column(name = "tent_item_reorder_level")
    private String tentItemReorderLevel;

    @Column(name = "tent_item_retail_max_price")
    private Object tentItemRetailMaxPrice;

    @Column(name = "tent_item_retail_min_price")
    private Object tentItemRetailMinPrice;

    @Column(name = "tent_item_tax_id")
    private Boolean tentItemTaxId;

    @Column(name = "tent_item_type")
    private String tentItemType;

    @Column(name = "tent_item_total_stock")
    private Object tentItemTotalStock;

    @Column(name = "tent_item_available_stock")
    private Object tentItemAvailableStock;

    @Column(name = "tent_item_expired_stock")
    private Object tentItemExpiredStock;

    @Column(name = "tent_item_allow_prescription")
    private Object tentItemAllowPrescription;

    @Column(name = "tent_item_sub_type")
    private String tentItemSubType;

    @Column(name = "tent_item_strenth")
    private Object tentItemStrenth;

    @Column(name = "tent_item_strenth_unit")
    private Object tentItemStrenthUnit;

    @Column(name = "tent_item_instruction")
    private Boolean tentItemInstruction;

    @Column(name = "created_on")
    private Object createdOn;

    @Column(name = "created_by", nullable = false)
    private Integer createdBy;

    @Column(name = "modified_on")
    private Object modifiedOn;

    @Column(name = "modified_by")
    private Integer modifiedBy;

    @Column(name = "tent_manufacturer_name")
    private String tentManufacturerName;

}