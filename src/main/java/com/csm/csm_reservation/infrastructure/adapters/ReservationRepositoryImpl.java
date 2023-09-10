package com.csm.csm_reservation.infrastructure.adapters;

import com.csm.csm_reservation.domain.ports.ReservationRepository;
import com.csm.csm_reservation.domain.web.ReservationRequest;
import com.csm.csm_reservation.domain.web.ReservationResponse;
import com.csm.csm_reservation.infrastructure.repository.Reservation;
import com.csm.csm_reservation.infrastructure.repository.ReservationJpaRepository;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class ReservationRepositoryImpl implements ReservationRepository {

    private final ReservationJpaRepository reservationJpaRepository;

    @Override
    public String findByProjectName(String projectName) {
        return reservationJpaRepository.findByProjectName(projectName).getProjectName();
    }

    @Override
    public ReservationResponse addNewReservation(ReservationRequest request) {
        UUID reservationId = UUID.randomUUID();

        Reservation reservation = new Reservation(
                reservationId.toString(),
                request.getProjectName(),
                request.getStartDate(),
                request.getEndDate(),
                request.getReservationType());

        reservationJpaRepository.save(reservation);

        return new ReservationResponse(reservationId);
    }
}
