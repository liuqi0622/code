package com.liuqi.model;

import java.math.BigDecimal;
import java.util.Date;

public class EInv {
    private Long id;

    private String skuCode;

    private Integer invType;

    private Integer status;

    private String orgCode;

    private Integer qty;

    private Integer preaddQty;

    private Integer presubQty;

    private Integer lockQty;

    private BigDecimal cost;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String ownerCode;

    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    public Integer getInvType() {
        return invType;
    }

    public void setInvType(Integer invType) {
        this.invType = invType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getPreaddQty() {
        return preaddQty;
    }

    public void setPreaddQty(Integer preaddQty) {
        this.preaddQty = preaddQty;
    }

    public Integer getPresubQty() {
        return presubQty;
    }

    public void setPresubQty(Integer presubQty) {
        this.presubQty = presubQty;
    }

    public Integer getLockQty() {
        return lockQty;
    }

    public void setLockQty(Integer lockQty) {
        this.lockQty = lockQty;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode == null ? null : ownerCode.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}