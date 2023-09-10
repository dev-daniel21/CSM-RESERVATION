package com.csm.csm_reservation.domain.model;

import java.sql.Timestamp;
import java.time.OffsetTime;

class ReservationDomain {

    private String projectName;
    private Timestamp startDate;
    private Timestamp endDate;
    private OffsetTime startAt;
    private OffsetTime endAt;

    private WorksTypeDomain worksTypeDomain;
}
