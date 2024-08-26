package com.example.demo;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.sbb.SbbApplication;
import com.example.sbb.question.Question;
import com.example.sbb.question.QuestionRepository;

@SpringBootTest
@ContextConfiguration(classes = SbbApplication.class)
class SbbApplicationTests {
	
	
	@Autowired
	private QuestionRepository questionRepository;
	//findBySbujectAndContent 매서드
	@Test
	void findSC() {
		Question q = this.questionRepository.findBySubjectAndContent(
				"sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
		assertEquals(5, q.getId());
		}
	
	
	
	
	
	
	//findBySubject 매서드
	void findBS() {
		Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
		assertEquals(5, q.getId());
		}
	
	
	//readDetail

	void readdetail() {
		Optional<Question> oq = this.questionRepository.findById(5);
		if(oq.isPresent()) {
			Question q = oq.get();
			assertEquals("sbb가 무엇인가요?", q.getSubject());
		}
	}
	
	
	//readList
	void readlist() {
		List<Question> all = this.questionRepository.findAll();
        assertEquals(2, all.size());
	}
	
	
	


	//create
	void testJpa() {
		Question q1 = new Question();
		
		q1.setSubject("sbb가 무엇인가요?");
		q1.setContent("sbb에 대해서 알고 싶습니다.");
		q1.setCreateDate(LocalDateTime.now());
		
		this.questionRepository.save(q1); //첫번째 질문 저장
		
		
		Question q2 = new Question();
		
		q2.setSubject("스프링 부트 모델 질문입니다.");
		q2.setContent("id는 자동으로 생성되나요?");
		q2.setCreateDate(LocalDateTime.now());
		
		this.questionRepository.save(q2); // 두번째 질문 저장
	}
	
	
}
