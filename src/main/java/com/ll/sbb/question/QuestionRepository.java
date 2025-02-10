package com.ll.sbb.question;

//생성된 데이터베이스 테이블의 데이터를 저장, 조회, 삭제 등을 할 수 있도록 도와주는 인터페이스
//테이블에 접근하고, 데이터를 관리하는 메소드를 제공

import org.springframework.data.jpa.repository.JpaRepository;

//Question의 기본키가 Integer
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
