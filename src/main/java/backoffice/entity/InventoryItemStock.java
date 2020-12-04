package backoffice.entity;

import lombok.*;

import javax.persistence.*;


@Table(name = "tbl_tent_item_stock")
@Data
public class InventoryItemStock {

    @Id
    @Column(name = "tent_item_stock_id", nullable = false)
    private Long itemStockId;

    @Column(name = "tent_item_id", nullable = false)
    private Integer itemId;

    @Column(name = "tent_item_stock_trn_type")
    private String itemStockTrnType;

    @Column(name = "tent_item_stock_quantity")
    private Integer itemStockQuantity;

    @Column(name = "tent_item_stock_batch")
    private String itemStockBatch;

    @Column(name = "tent_item_stock_exp_mth")
    private String itemStockExpMth;

    @Column(name = "tent_item_stock_exp_yr")
    private Integer itemStockExpYr;

    @Column(name = "tent_item_retail_min_price")
    private Object itemRetailMinPrice;

    @Column(name = "tent_item_stock_unit_cost")
    private Object itemStockUnitCost;

    @Column(name = "tent_item_stock_tot_cost")
    private Object itemStockTotCost;

    @Column(name = "created_on")
    private Object createdOn;

    @Column(name = "created_by", nullable = false)
    private Integer createdBy;

    @Column(name = "modified_on")
    private Object modifiedOn;

    @Column(name = "modified_by")
    private Integer modifiedBy;

}