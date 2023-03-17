package com.wak.chimplanet.controll;

import com.google.gson.JsonArray;


import com.wak.chimplanet.domain.Board;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transaction;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/board")
public class BoardController {

    //    @Autowired
//    UserService userService;
    @Autowired
    EntityManager em;

    @Transactional
    @RequestMapping(method = RequestMethod.POST,value = "/insert")
    public ResponseEntity<String> insert(
            @RequestParam(defaultValue = "") String title,
            @RequestParam(defaultValue = "") String content,
            @RequestParam(defaultValue = "") String writer,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "text/html; charset=UTF-8");

        Board board = new Board();
        board.setTitle(title);
        board.setContent(content);
        board.setWriter(writer);

        em.persist(board);
        em.close();

        return new ResponseEntity<String>(board.toString(), httpHeaders, HttpStatus.OK);
    }

    @Transactional
    @RequestMapping(method = RequestMethod.PUT,value = "/update")
    public ResponseEntity<String> update(
            @RequestParam(defaultValue = "") Long board_id,
            @RequestParam(defaultValue = "") String title,
            @RequestParam(defaultValue = "") String content,
            @RequestParam(defaultValue = "") String writer,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "text/html; charset=UTF-8");


        Board board = em.find(Board.class, board_id);
        board.setTitle(title);
        board.setContent(content);
        board.setWriter(writer);

        em.close();

        return new ResponseEntity<String>(board.toString(), httpHeaders, HttpStatus.OK);
    }

    @Transactional
    @RequestMapping(method = RequestMethod.DELETE,value = "/delete")
    public ResponseEntity<String> delete(
            @RequestParam(defaultValue = "") Long board_id,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "text/html; charset=UTF-8");

        Board board = em.find(Board.class, board_id);
        em.remove(board);

        em.close();

        return new ResponseEntity<String>(board.toString(), httpHeaders, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/show_list")
    public ResponseEntity<String> show_list(
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "text/html; charset=UTF-8");

        List<Board> boardList = em.createQuery("select b from Board as b", Board.class).getResultList();

        em.close();

        return new ResponseEntity<String>(boardList.toString(), httpHeaders, HttpStatus.OK);
    }


}
