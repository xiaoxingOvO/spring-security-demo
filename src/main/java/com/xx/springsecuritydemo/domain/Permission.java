package com.xx.springsecuritydemo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName t_permission
 */
@TableName(value ="t_permission")
public class Permission implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private String name;

    private String sn;

    /**
     * 
     */
    private String resource;

    /**
     * 
     */
    private Integer state;

    /**
     * 
     */
    private Long menuId;

    /**
     * 
     */
    private String expression;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public String getResource() {
        return resource;
    }

    /**
     * 
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * 
     */
    public Integer getState() {
        return state;
    }

    /**
     * 
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * 
     */
    public String getExpression() {
        return expression;
    }

    /**
     * 
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Permission other = (Permission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getResource() == null ? other.getResource() == null : this.getResource().equals(other.getResource()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getExpression() == null ? other.getExpression() == null : this.getExpression().equals(other.getExpression()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getResource() == null) ? 0 : getResource().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sn='" + sn + '\'' +
                ", resource='" + resource + '\'' +
                ", state=" + state +
                ", menuId=" + menuId +
                ", expression='" + expression + '\'' +
                '}';
    }
}
