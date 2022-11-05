package com.jat.business;

import java.time.LocalDate;

public class B1User {

    private long id;
    private String name;
    private String pass;
    private LocalDate regDate;

    public B1User(long id, String name, String pass, LocalDate regDate) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.regDate = regDate;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", regDate=" + regDate +
                '}';
    }
}
