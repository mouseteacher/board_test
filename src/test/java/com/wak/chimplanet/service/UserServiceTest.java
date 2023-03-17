package com.wak.chimplanet.service;

import com.wak.chimplanet.controll.RESTfulController;
import com.wak.chimplanet.dto.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = RESTfulController.class)
class UserServiceTest {

    @Qualifier(value = "entityManager")
    @Autowired // 원래는 @PersistenceContext 을 많이 썼는데, 이제는 오토와이어도 잘됩니다.
    private EntityManager em;


    @BeforeEach
        // 기본적으로 테스트가 시작하기 전에 실행하는 함수
    void createTest() {

    }

    @Test
        // 실제 테스트 함수
    void jpqlTest() {
        List<User> members = em.createQuery("select m from User m", User.class).getResultList();


    }

}