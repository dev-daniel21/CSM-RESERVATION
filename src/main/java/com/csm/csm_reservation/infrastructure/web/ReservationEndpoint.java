package com.csm.csm_reservation.infrastructure.web;

import com.csm.csm_reservation.domain.model.ReservationDomain;
import com.csm.csm_reservation.domain.web.ReservationRequest;
import com.csm.csm_reservation.domain.web.ReservationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reservation")
@RequiredArgsConstructor
class ReservationEndpoint {

    private final ReservationService reservationService;

    @GetMapping(value = "/getAll")
    List<ReservationDomain> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping(value = "/{id}")
    ReservationDomain getReservationById(@PathVariable(name = "id") String id) {
        return reservationService.getReservationById(id);
    }

    @PostMapping
    ReservationResponse addReservation(@RequestBody ReservationRequest request) {
        return reservationService.addReservation(request);
    }

    @PutMapping
    void updateReservation(@RequestBody ReservationRequest request) {
        reservationService.updateReservation(request);
    }

    @DeleteMapping(value = "/{id}")
    void deleteReservation(@PathVariable(name = "id") String id) {
        reservationService.deleteReservation(id);
    }

}
