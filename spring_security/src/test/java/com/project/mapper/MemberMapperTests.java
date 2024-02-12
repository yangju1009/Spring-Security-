package com.project.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.domain.MemberVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class MemberMapperTests {
	
	private final Logger log = LoggerFactory.getLogger(MemberMapperTests.class);
	
	@Setter
	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void testRead() {
		
		MemberVO vo = mapper.read("admin90");
		
		log.info(vo.toString());
		
		vo.getAuthList().forEach(authVO -> log.info(authVO.toString()));
	}
}
