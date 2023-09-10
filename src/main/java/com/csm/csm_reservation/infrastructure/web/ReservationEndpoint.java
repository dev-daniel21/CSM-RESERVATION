package com.csm.csm_reservation.infrastructure.web;

import com.csm.csm_reservation.domain.web.ReservationRequest;
import com.csm.csm_reservation.domain.web.ReservationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reservation")
@RequiredArgsConstructor
class ReservationEndpoint {

    private final ReservationService reservationService;

    @PostMapping
    ReservationResponse addReservation(@RequestBody ReservationRequest request) {
        return reservationService.addReservation(request);
    }


}
