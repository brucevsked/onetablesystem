package com.jat.system;

public class TableRecord {
    private long id;
    private long row;
    private String column;
    private String value;
    private String tag;

    public TableRecord(long id, long row, String column, String value, String tag) {
        this.id = id;
        this.row = row;
        this.column = column;
        this.value = value;
        this.tag = tag;
    }

    public long getId() {
        return id;
    }

    public long getRow() {
        return row;
    }

    public String getColumn() {
        return column;
    }

    public String getValue() {
        return value;
    }

    public String getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", row=" + row +
                ", column='" + column + '\'' +
                ", value='" + value + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
