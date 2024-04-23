package edu.iu.habahram.ducksservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(schema = "duck")
public final class DuckEntity {

    @Id
    private int id;

    private String name;
    private DuckType Type;

    public DuckEntity() {
    }
    public DuckEntity(int id, String name, DuckType Type){
        this.id = id;
        this.name = name;
        this.Type = Type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DuckType getType() {
        return Type;
    }

    public void setType(DuckType type) {
        Type = type;
    }




}
