package com.csm.csm_reservation.infrastructure.adapters;

import com.csm.csm_reservation.domain.model.ReservationDomain;
import com.csm.csm_reservation.domain.ports.ReservationRepository;
import com.csm.csm_reservation.domain.web.ReservationRequest;
import com.csm.csm_reservation.domain.web.ReservationResponse;
import com.csm.csm_reservation.infrastructure.repository.Reservation;
import com.csm.csm_reservation.infrastructure.repository.ReservationJpaRepository;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public class ReservationRepositoryImpl implements ReservationRepository {

    private final ReservationJpaRepository reservationJpaRepository;

    @Override
    public List<ReservationDomain> getAllReservations() {

        var savedReservations = reservationJpaRepository.findAll();
        List<ReservationDomain> reservationDomain = new ArrayList<>();
        savedReservations.forEach(reservation -> reservationDomain.add(Reservation.toDomain(reservation)));

        return reservationDomain;
    }

    @Override
    public Reservation getReservationById(String id) {

        return reservationJpaRepository.findByReservationId(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));
    }

    @Override
    public ReservationResponse addNewReservation(ReservationRequest request) {
        UUID reservationId = UUID.randomUUID();

        Reservation reservation = new Reservation(
                reservationId.toString(),
                request.projectName(),
                request.startDate(),
                request.endDate(),
                request.reservationType());

        reservationJpaRepository.save(reservation);

        return new ReservationResponse(reservationId, "added");
    }

    @Override
    @Transactional
    public void updateReservation(ReservationRequest request) {

        reservationJpaRepository.updateReservation(request.projectName(), request.startDate(), request.endDate(), request.reservationType());
    }

    @Override
    @Transactional
    public void deleteReservation(String id) {
        reservationJpaRepository.deleteByReservationId(id);
    }

    @Override
    public String findByProjectName(String projectName) {
        return reservationJpaRepository.findByProjectName(projectName).getProjectName();
    }

}
