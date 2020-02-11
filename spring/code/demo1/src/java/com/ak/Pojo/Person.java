package com.ak.Pojo;

public class Person {
    private int id;
    private String name;
    private Double score;

    public Person() {
    }

    public Person(int id, String name, Double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Person(Person person) {
        this.score=person.score;
        this.name=person.name;
        this.id=person.id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
