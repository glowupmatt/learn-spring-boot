package com.matthew.learn_spring_boot;

public record Course(
    long id,
    String name,
    String author
) {
    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    } 
}
