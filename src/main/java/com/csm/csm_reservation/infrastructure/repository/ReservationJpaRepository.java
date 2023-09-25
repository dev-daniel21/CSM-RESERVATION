package com.csm.csm_reservation.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;
import java.util.Optional;

public interface ReservationJpaRepository extends JpaRepository<Reservation, Long> {

    Reservation findByProjectName(String projectName);

    Optional<Reservation> findByReservationId(String id);

    @Modifying
    @Query("UPDATE Reservation r SET r.startDate = ?2, r.endDate = ?3, r.reservationType = ?4 WHERE r.projectName = ?1")
    void updateReservation(String projectName, Timestamp startDate, Timestamp endDate, String reservationType);

    void deleteByReservationId(String id);

}
