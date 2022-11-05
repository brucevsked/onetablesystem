package com.jat.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

@Table(name = "systemdata1")
@Entity
public class TableRecordPO implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long r;
    private String c;
    private String v;
    private String t;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRow() {
        return r;
    }

    public void setRow(long row) {
        this.r = row;
    }

    public String getColumn() {
        return c;
    }

    public void setColumn(String column) {
        this.c = column;
    }

    public String getValue() {
        return v;
    }

    public void setValue(String value) {
        this.v = value;
    }

    public String getTag() {
        return t;
    }

    public void setTag(String tag) {
        this.t = tag;
    }

    public TableRecordPO() {
    }

    public TableRecordPO(long id, long row, String column, String value, String tag) {
        this.id = id;
        this.r = row;
        this.c = column;
        this.v = value;
        this.t = tag;
    }
}
