package com.mirim.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

//public class AdminConnection implements EnvironmentAware, InitializingBean {
public class AdminConnection implements InitializingBean {	
	private String adminId;		// ������ Id
	private String adminPw;		// ������ Pw

//	private Environment env;	// �ܺο��� ������ ������ (ȯ��) ��ü�� �ʿ���

	
//	@Override
//	public void setEnvironment(Environment environment) {	// EnvironmentAware ���
//		// TODO Auto-generated method stub
//		setEnv(environment);
//	}

	@Override
	public void afterPropertiesSet() throws Exception {		// InitializingBean ���
		// TODO Auto-generated method stub
		// �ʱ�ȭ �� �ڵ� ����Ǵ� �޼ҵ�
//		setAdminId(env.getProperty("adminId"));
//		setAdminPw(env.getProperty("adminPw"));
		
//		setAdminId("adminId");
//		setAdminPw("adminPw");
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

//	public Environment getEnv() {
//		return env;
//	}
//
//	public void setEnv(Environment env) {
//		this.env = env;
//	}
	
	
}
