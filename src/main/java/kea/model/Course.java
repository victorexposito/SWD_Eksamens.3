package kea.model;


import javax.persistence.*;

@Entity
@Table (name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int course_id;
    @Column(name = "name")
    private String name;
    private int duration;
    private int price;

    public Course(String name, int duration, int price) {
        this.name = name;
        this.duration = duration;
        this.price = price;
    }

    public Course() {
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int id) {
        this.course_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

