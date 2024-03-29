package fi.teemu.clippa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		final String[] authRequiredPaths = {
				"/users",
				"/users/**"
		};

		http.authorizeHttpRequests(requests -> requests
				.requestMatchers(authRequiredPaths).authenticated()
				.anyRequest().permitAll())
			.oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()))
			.csrf(AbstractHttpConfigurer::disable);

		return http.build();
	}
}
