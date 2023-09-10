package com.csm.csm_reservation.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationJpaRepository extends JpaRepository<Reservation, Long> {

    Reservation findByProjectName(String projectName);

}
