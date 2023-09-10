package com.csm.csm_reservation.domain.ports;

import com.csm.csm_reservation.domain.web.ReservationRequest;
import com.csm.csm_reservation.domain.web.ReservationResponse;

public interface ReservationRepository {

    String findByProjectName(String projectName);
    ReservationResponse addNewReservation(ReservationRequest request);

}
