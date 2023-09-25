package com.csm.csm_reservation.domain.ports;

import com.csm.csm_reservation.domain.model.ReservationDomain;
import com.csm.csm_reservation.domain.web.ReservationRequest;
import com.csm.csm_reservation.domain.web.ReservationResponse;
import com.csm.csm_reservation.infrastructure.repository.Reservation;

import java.util.List;

public interface ReservationRepository {

    List<ReservationDomain> getAllReservations();

    String findByProjectName(String projectName);

    ReservationResponse addNewReservation(ReservationRequest request);

    Reservation getReservationById(String id);

    void updateReservation(ReservationRequest request);

    void deleteReservation(String id);
}
