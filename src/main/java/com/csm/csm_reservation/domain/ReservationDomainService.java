package com.csm.csm_reservation.domain;

import com.csm.csm_reservation.domain.model.ReservationDomain;
import com.csm.csm_reservation.domain.ports.ReservationRepository;
import com.csm.csm_reservation.domain.web.ReservationRequest;
import com.csm.csm_reservation.domain.web.ReservationResponse;
import com.csm.csm_reservation.infrastructure.repository.Reservation;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ReservationDomainService {

    private final ReservationRepository reservationRepository;

    public List<ReservationDomain> getAllReservations() {
        return reservationRepository.getAllReservations();
    }

    public ReservationDomain getReservationById(String id) {
        var reservation = reservationRepository.getReservationById(id);
        return Reservation.toDomain(reservation);
    }

    public ReservationResponse addReservation(ReservationRequest request){

        return reservationRepository.addNewReservation(request);
    }

    public void updateReservation(ReservationRequest request) {

        reservationRepository.updateReservation(request);
    }

    public void deleteReservation(String id) {
        reservationRepository.deleteReservation(id);
    }
}
