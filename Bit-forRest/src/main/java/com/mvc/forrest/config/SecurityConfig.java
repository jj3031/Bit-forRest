package com.mvc.forrest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity//�ش� ���Ϸ� ��ť��Ƽ�� Ȱ��ȭ
@Configuration//IoC
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	//super ���� - ���� ��ť��Ƽ�� ������ �ִ� ����� ������ (Overriding)
		http.csrf().disable();//csrf ��ū�� ������� �ʰڴ�.
		http.authorizeHttpRequests() //�ΰ� ��û�� ����
			.antMatchers("/","/user/**","/storage/**","/rental/**").authenticated()
			.anyRequest().permitAll()
			.and()
			.formLogin()
			.loginPage("/user/login") //GET
			.loginProcessingUrl("/user/login") //POST
			.defaultSuccessUrl("/")
			.and()
			.logout()
			.logoutUrl("/�α׾ƿ���ûUrl")// �α��ΰ� �α׾ƿ��� csrf ���� ��� ���� ���� �α׾ƿ��� get��ĵ� ���� POST ��û�� ���
			.logoutSuccessUrl("�α׾ƿ� ������ redircet url");
			//1. antMatchers �ȿ� �ִ� �ּҿ� ���� �� ���� ������ �ʿ��ϴ�
			//2. �� �� ��� ������Ʈ�� �� �����Ѵ�
			//3. �׸���
			//4. ������ �ʿ��� ������ ��û�� formLogin �� ���̴�
			//5. �α��� ��û�� �ϸ� POST �� �� �͸� Intercept
			//6. �α��� �������� /user/login�̰�, 1�� �ּҷ� ���� ���� �����ϸ� �ڵ����� �����ش�
			//7. ����� �α��� �ߴٸ� / �� redirect.
	}
}
