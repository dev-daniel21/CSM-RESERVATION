package com.csm.csm_reservation.domain.web;

import java.sql.Timestamp;


public record ReservationRequest(
        String projectName,
        Timestamp startDate,
        Timestamp endDate,
        String reservationType) {
}
