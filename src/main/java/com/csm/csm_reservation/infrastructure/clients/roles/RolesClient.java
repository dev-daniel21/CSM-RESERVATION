package com.csm.csm_reservation.infrastructure.clients.roles;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
class RolesClient {

    private final RestTemplate restTemplate;

    public String getUserRole(String userId) {

        String url = String.format("http://localhost:8315/roles/%s", userId);

        UserRole userRole = restTemplate.getForObject(url, UserRole.class);
        String roles = userRole.getUserRole();

        return roles;
    }
}
