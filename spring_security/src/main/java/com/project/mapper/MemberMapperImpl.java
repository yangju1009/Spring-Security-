package com.project.mapper;

import org.springframework.stereotype.Repository;

import com.project.domain.MemberVO;

@Repository
public class MemberMapperImpl implements MemberMapper {

    @Override
    public MemberVO read(String userid) {
        // 여기에 실제 데이터베이스에서 회원 정보를 조회하는 코드를 작성합니다.
        // 이 코드는 데이터베이스와의 연결, 쿼리 실행 등을 포함해야 합니다.
        // 여기에서는 가짜 데이터를 반환하도록 하겠습니다.
        MemberVO member = new MemberVO();
        member.setUserid(userid);
        member.setUserName("John Doe"); // 예시로 사용자 이름을 설정합니다.
        // 나머지 필드들도 설정합니다.

        return member;
    }
}