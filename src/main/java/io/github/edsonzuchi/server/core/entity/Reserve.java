package io.github.edsonzuchi.server.core.entity;

/**
* Objeto para armazar a reserva do hospede
* */
public class Reserve {

    Integer type;
    String name;

    public Reserve(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
