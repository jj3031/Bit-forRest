package com.mvc.forrest.config.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.net.SyslogOutputStream;


@Service// IoC
public class PrincipalDetailsService implements UserDetailsService {

	
	//return�� �� �Ǹ� �ڵ����� ������ �����
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//System.out.println("����Ȯ��"+username);
		
		
		//�α��ο� ���� ���� �ۼ�
		//return null; //return type Ȯ�� �� ��
		return new LoginUser();
	}

}
