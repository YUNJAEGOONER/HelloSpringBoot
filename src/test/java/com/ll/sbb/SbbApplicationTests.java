package com.ll.sbb;

import com.ll.sbb.answer.Answer;
import com.ll.sbb.answer.AnswerRepository;
import com.ll.sbb.question.Question;
import com.ll.sbb.question.QuestionRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository; //멤버함수?...

	@Autowired
	private AnswerRepository answerRepository;

	@Transactional
	@Test
	void testJpa() {
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//
//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);

//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(4, all.size());
//
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());

//		Optional<Question> question = questionRepository.findById(1);
//		if(question.isPresent()) {
//			Question q = question.get();
//			assertEquals("sbb가 무엇인가요?", q.getSubject());
//		}

//		//질문 데이터 수정하기
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepository.save(q);

//		//삭제하기
//		Optional<Question> oq = questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(3, this.questionRepository.count());

//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//
//		Answer a = new Answer();
//		a.setContent("네 자동으로 생성됩니다.");
//		a.setQuestion(q); //어떤 질문(Question)에 대한 답변인지...
//		a.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);

//		Optional<Answer> oa = answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//		Answer a = oa.get();
//		assertEquals(2, a.getQuestion().getId());

		Optional<Question> oq = questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();

		List<Answer> answersList = q.getAnswers();

		assertEquals(1, answersList.size());
		assertEquals("네 자동으로 생성됩니다.", answersList.get(0).getContent());

	}

}
