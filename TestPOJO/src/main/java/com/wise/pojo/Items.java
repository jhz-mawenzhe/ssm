package com.wise.pojo;

import java.io.Serializable;
import java.util.Date;

public class Items implements Serializable {
    /**
     * 商品id
     */
    private Integer id;

    /**
     * 商品名字
     */
    private String name;

    /**
     * 商品价钱
     */
    private Float price;

    /**
     * 商品图片
     */
    private String pic;

    /**
     * 商品时间
     */
    private Date createtime;

    /**
     * 商品描述
     */
    private String detail;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}