package com.sitelabs.security1.auth;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationResponse {
    private String token;
}
