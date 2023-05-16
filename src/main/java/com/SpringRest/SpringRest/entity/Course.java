package com.SpringRest.SpringRest.entity;

public class Course {
private long id;

    private String title;
    public Course(String title, long id,String description)
 {
     this.id=id;
     this.title=title;
     this.description=description;
 }
    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String description;

}
