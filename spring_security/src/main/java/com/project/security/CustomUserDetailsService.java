package com.project.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.project.domain.CustomUser;
import com.project.domain.MemberVO;
import com.project.mapper.MemberMapper;

import lombok.Setter;

public class CustomUserDetailsService implements UserDetailsService {

    private final Logger log = LoggerFactory.getLogger(CustomUserDetailsService.class);

    @Setter
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        log.warn("Load User By UserName : " + userName);

        // userName은 userid를 의미합니다
        MemberVO vo = memberMapper.read(userName);

        log.warn("queried by member mapper: " + vo);

        if (vo == null) {
            throw new UsernameNotFoundException("User not found with username: " + userName);
        }

        return new CustomUser(vo);
    }
}
