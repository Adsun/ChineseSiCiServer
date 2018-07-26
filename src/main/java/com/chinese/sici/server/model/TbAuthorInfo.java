package com.chinese.sici.server.model;

import java.util.Date;

public class TbAuthorInfo {
    private Integer id;

    private String authorId;

    private String name;

    private String dynasty;

    private Date createdTime;

    private Date updatedTime;

    private byte[] otherInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDynasty() {
        return dynasty;
    }

    public void setDynasty(String dynasty) {
        this.dynasty = dynasty == null ? null : dynasty.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public byte[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(byte[] otherInfo) {
        this.otherInfo = otherInfo;
    }
}