package com.project.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
		com.project.config.RootConfig.class,
		com.project.config.SecurityConfig.class
})
@Log4j
public class PasswordEncoderTests {
	
	private final Logger log = LoggerFactory.getLogger(PasswordEncoderTests.class);
	
	@Setter
	@Autowired
	private PasswordEncoder pwEncoder;
	
	@Test
	public void testEncode() {
		
		String str = "member";
		
		String enStr = pwEncoder.encode(str);
		
		// 패스워드 인코딩 결과는 매번 조금씩 달라질 수 있다.
		log.info("인코딩된 비밀번호 : " + enStr);
	}
}
