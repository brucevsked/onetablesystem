package com.jat.system;

import java.util.List;

public class DatabaseTable {
    private Database database;
    private List<Table> tables;

    public DatabaseTable(Database database, List<Table> tables) {
        this.database = database;
        this.tables = tables;
    }

    public Database getDatabase() {
        return database;
    }

    public List<Table> getTables() {
        return tables;
    }

    @Override
    public String toString() {
        return "{" +
                "database=" + database +
                ", tables=" + tables +
                '}';
    }
}
