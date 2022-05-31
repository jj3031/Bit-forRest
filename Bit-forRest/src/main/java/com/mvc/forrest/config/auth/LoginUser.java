package com.mvc.forrest.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class LoginUser implements UserDetails {

	/**
	 �α��� ���� �� ������
	 ������ ��ť��Ƽ�� �α��� ��û�� ����ä�� �α����� �����ϰ� �Ϸᰡ �Ǹ� UserDetails Ÿ���� ������Ʈ��
	 ������ ��ť��Ƽ�� ������ ���� ����ҿ� ������ ���ش�.
	 */
	private static final long serialVersionUID = 1L;
	
	//private User user;
	//������
	//getter setter ����� ��� ��
	
	//������ �Ѱ� �̻��� ��찡 �ֱ� ������ Collection���� ������
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		Collection<GrantedAuthority> collector = new ArrayList<>();
		collector.add(new GrantedAuthority() {
			//���ٽ� ���� �� ���Ÿ� ������
			@Override
			public String getAuthority() {
				// TODO Auto-generated method stub
				//return user.getRole;
				return null;
			}
		});
		return collector;
	}

	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public String getUsername() {
		//id
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// ���� ���� �Ǵ� ���� ����� false ����
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// ���� ��� �Ǵ� ���� ����̸� false ����
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// ��й�ȣ�� ���� �˻� ���� ������ false
		return true;
	}

	@Override
	public boolean isEnabled() {
		// ���� Ȱ��ȭ �˻� �޸� ������ false
		return true;
	}

}
