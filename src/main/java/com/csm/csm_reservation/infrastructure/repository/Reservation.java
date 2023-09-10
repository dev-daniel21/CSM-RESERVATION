package com.csm.csm_reservation.infrastructure.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "reservation")
@Getter
@Setter
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reservation_id")
    private String reservationId;

    private String projectName;
    private Timestamp startDate;
    private Timestamp endDate;

    private String reservationType;

    public Reservation(String reservationId, String projectName, Timestamp startDate, Timestamp endDate, String reservationType) {
        this.reservationId = reservationId;
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservationType = reservationType;
    }

}
