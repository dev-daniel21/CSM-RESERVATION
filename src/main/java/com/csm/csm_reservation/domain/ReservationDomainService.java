package com.csm.csm_reservation.domain;

import com.csm.csm_reservation.domain.ports.ReservationRepository;
import com.csm.csm_reservation.domain.web.ReservationRequest;
import com.csm.csm_reservation.domain.web.ReservationResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReservationDomainService {

    private final ReservationRepository reservationRepository;

    public ReservationResponse addReservation(ReservationRequest request){

//        var project = reservationRepository.findByProjectName(request.getProjectName());


        return reservationRepository.addNewReservation(request);
    }


}
