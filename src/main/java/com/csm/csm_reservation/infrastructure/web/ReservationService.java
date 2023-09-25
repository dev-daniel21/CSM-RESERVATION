package com.csm.csm_reservation.infrastructure.web;

import com.csm.csm_reservation.domain.ReservationDomainService;
import com.csm.csm_reservation.domain.model.ReservationDomain;
import com.csm.csm_reservation.domain.web.ReservationRequest;
import com.csm.csm_reservation.domain.web.ReservationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class ReservationService {

    private final ReservationDomainService reservationDomainService;

    public List<ReservationDomain> getAllReservations() {
        return reservationDomainService.getAllReservations();
    }

    public ReservationDomain getReservationById(String id) {
        return reservationDomainService.getReservationById(id);
    }

    public ReservationResponse addReservation(ReservationRequest request) {

        return reservationDomainService.addReservation(request);
    }

    public void updateReservation(ReservationRequest request) {
        reservationDomainService.updateReservation(request);
    }

    public void deleteReservation(String id) {
        reservationDomainService.deleteReservation(id);
    }
}
