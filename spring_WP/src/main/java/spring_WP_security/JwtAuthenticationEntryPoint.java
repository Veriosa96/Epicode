package spring_WP_security;

import java.io.IOException;

import org.springframework.security.core.AuthenticationException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtAuthenticationEntryPoint {
    private static final long serialVersionUID = -7858869558953243875L;
    
    public void commence(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException authException) throws IOException {
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
