//package com.wak.chimplanet.repository;
//
//import com.wak.chimplanet.dto.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//
//public interface UserRepository extends JpaRepository<User, Long> ,UserRepositoryCustom{
//
//    @Query("select u from User u")
//    List<User> findAllUser();
//
//
//
//
//}
