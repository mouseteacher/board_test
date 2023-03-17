//package com.wak.chimplanet.repository;
//
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import com.wak.chimplanet.dto.User;
//import lombok.RequiredArgsConstructor;
//
//import java.util.List;
//
//import static com.wak.chimplanet.dto.QUser.user;
//@RequiredArgsConstructor
//public class UserRepositoryCustomImpl implements UserRepositoryCustom {
//    private final JPAQueryFactory jpaQueryFactory;
//
//    @Override
//    public List<User> findAllUser() {
//        return jpaQueryFactory.selectFrom(user)
//                .fetch();
//    }
//}
