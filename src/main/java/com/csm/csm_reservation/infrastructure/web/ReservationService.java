package com.csm.csm_reservation.infrastructure.web;

import com.csm.csm_reservation.domain.ReservationDomainService;
import com.csm.csm_reservation.domain.web.ReservationRequest;
import com.csm.csm_reservation.domain.web.ReservationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class ReservationService {

    private final ReservationDomainService reservationDomainService;

    public ReservationResponse addReservation(ReservationRequest request) {

        return reservationDomainService.addReservation(request);
    }
}
