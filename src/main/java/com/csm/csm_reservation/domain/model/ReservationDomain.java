package com.csm.csm_reservation.domain.model;

import lombok.Builder;

import java.sql.Timestamp;

@Builder
public record ReservationDomain(
        String reservationId,
        String projectName,
        Timestamp startDate,
        Timestamp endDate,
        String reservationType
) {


}
