package com.csm.csm_reservation.infrastructure.repository;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "works_type")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class WorksType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String worksTypeName;

    @OneToOne
    private Reservation reservation;

    @OneToOne
    private TruckType truckType;

}
