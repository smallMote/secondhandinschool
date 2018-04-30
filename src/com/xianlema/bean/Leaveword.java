package com.xianlema.bean;

import java.util.Date;

public class Leaveword {
    private String LeavewordID;
    private String ShopID;
    private String content;
    private String name;
    private Date date;

    public String getLeavewordID() {
        return LeavewordID;
    }

    public void setLeavewordID(String leavewordID) {
        LeavewordID = leavewordID;
    }

    public String getShopID() {
        return ShopID;
    }

    public void setShopID(String shopID) {
        ShopID = shopID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
