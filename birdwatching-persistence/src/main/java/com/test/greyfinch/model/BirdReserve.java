package com.test.greyfinch.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "bird_reserve")
public class BirdReserve implements Serializable {

    private Long id;
    private Bird bird;
    private Reserve reserve;
    private Date visitDate;
    private Double percentage;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bird_id")
    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reserve_id")
    public Reserve getReserve() {
        return reserve;
    }

    public void setReserve(Reserve reserve) {
        this.reserve = reserve;
    }

    @Column(name = "visit_date")
    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    @Column(name = "percentage")
    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "BirdReserve{" +
                "id=" + id +
                ", bird=" + bird +
                ", reserve=" + reserve +
                ", visitDate=" + visitDate +
                ", percentage=" + percentage +
                '}';
    }
}
