package com.nimap.securtiy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("aswini").password("Password").roles("ADMIN").and()
				.withUser("aswiniKumarMohanty").password("aswini123").roles("read").and().withUser("aswiniKumar")
				.password("aswini231").roles("read");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/balance").authenticated().antMatchers("/statment").authenticated()
				.antMatchers("/loan").authenticated().antMatchers("/auth/**").fullyAuthenticated().antMatchers("/home")
				.permitAll().antMatchers("/contact").permitAll().and().exceptionHandling().accessDeniedPage("/403")

				.and().csrf().disable();
	}

	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
}
