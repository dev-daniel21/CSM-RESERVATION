package com.csm.csm_reservation.infrastructure.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "truck_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TruckType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String additionalInfo;

    @OneToOne
    private WorksType worksType;

}
