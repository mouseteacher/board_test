//package com.wak.chimplanet.service;
//
//import com.wak.chimplanet.dto.User;
//import com.wak.chimplanet.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//public class UserService {
//    @Autowired
//    UserRepository userRepository;
//
//    @Transactional(readOnly = true)
//    public List<User> findAll(){
//        return  userRepository.findAllUser();
//    }
//
//
//
//}
