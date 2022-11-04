package com.jat.system;

public class TableColumnDataType {
    private TableColumn column;
    private DataType dataType;

    public TableColumnDataType(TableColumn column, DataType dataType) {
        this.column = column;
        this.dataType = dataType;
    }

    public TableColumn getColumn() {
        return column;
    }

    public DataType getDataType() {
        return dataType;
    }

    public String toString() {
        return "{" +
                "column=" + column +
                ", dataType=" + dataType +
                '}';
    }
}
