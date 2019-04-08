package rocks.zipcode.io.quiz4.collections;

import java.util.Comparator;

/**
 * @author leon on 11/12/2018.
 */
public class Student implements Comparable<Student> {
    private Integer id;
    private Double amountOfHours;

    public Student() {
        this(Integer.MIN_VALUE);
        this.amountOfHours = 0.0;
    }

    public Student(Integer id) {
        this.id = id;
        this.amountOfHours = 0.0;
    }

    public void learn(Double amountOfHours) {
        this.amountOfHours += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.amountOfHours;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getId() > o.getId()) {
            return 1;
        } else if (this.getId() < o.getId()) {
            return -1;
        }
        return 0;
    }
}