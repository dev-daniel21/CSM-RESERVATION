package com.csm.csm_reservation.domain.web;

import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class ReservationRequest {

    private String projectName;
    private Timestamp startDate;
    private Timestamp endDate;
    private String reservationType;

}
