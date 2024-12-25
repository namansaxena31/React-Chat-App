package com.mulchat.demo.Repositories;

import java.beans.JavaBean;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mulchat.demo.Entities.Chat;
import java.util.Optional;

@JavaBean
public interface ChatRepo extends JpaRepository<Chat, Long> {

    Optional<Chat> findByName(String name);

}
