package com.zs.framework.biz.model;

import javax.persistence.*;

public class Pickself {
    /**
     * 气站自提ID
     */
    @Id
    @Column(name = "pickself_id")
    private Integer pickselfId;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 气站ID
     */
    @Column(name = "station_id")
    private Integer stationId;

    /**
     * 获取气站自提ID
     *
     * @return pickself_id - 气站自提ID
     */
    public Integer getPickselfId() {
        return pickselfId;
    }

    /**
     * 设置气站自提ID
     *
     * @param pickselfId 气站自提ID
     */
    public void setPickselfId(Integer pickselfId) {
        this.pickselfId = pickselfId;
    }

    /**
     * 获取商品ID
     *
     * @return product_id - 商品ID
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置商品ID
     *
     * @param productId 商品ID
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取气站ID
     *
     * @return station_id - 气站ID
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * 设置气站ID
     *
     * @param stationId 气站ID
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }
}