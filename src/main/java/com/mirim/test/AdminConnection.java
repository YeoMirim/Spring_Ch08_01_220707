package com.mirim.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

//public class AdminConnection implements EnvironmentAware, InitializingBean {
public class AdminConnection implements InitializingBean {	
	private String adminId;		// 관리자 Id
	private String adminPw;		// 관리자 Pw

//	private Environment env;	// 외부에서 들어오기 때문에 (환경) 객체가 필요함

	
//	@Override
//	public void setEnvironment(Environment environment) {	// EnvironmentAware 상속
//		// TODO Auto-generated method stub
//		setEnv(environment);
//	}

	@Override
	public void afterPropertiesSet() throws Exception {		// InitializingBean 상속
		// TODO Auto-generated method stub
		// 초기화 후 자동 실행되는 메소드
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
