package com.csm.csm_reservation.infrastructure.config;

import com.csm.csm_reservation.domain.ReservationDomainService;
import com.csm.csm_reservation.domain.ports.ReservationRepository;
import com.csm.csm_reservation.infrastructure.adapters.ReservationRepositoryImpl;
import com.csm.csm_reservation.infrastructure.repository.ReservationJpaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
class BeanConfig {

    @Bean
    public ReservationRepository reservationRepository(ReservationJpaRepository reservationJpaRepository) {
        return new ReservationRepositoryImpl(reservationJpaRepository);
    }

    @Bean
    public ReservationDomainService reservationDomainService(ReservationRepository reservationRepository) {
        return new ReservationDomainService(reservationRepository);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
