package com.mulchat.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mulchat.demo.Entities.Message;
import com.mulchat.demo.Services.MessageService;
@CrossOrigin(origins = "http://localhost:3000") 
@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @PostMapping("/sendMessage")
    public ResponseEntity<Message> sendMessage(@RequestBody Message message) {
        // Delegate message handling to the service
        Message savedMessage = messageService.sendMessage(message);

        // Return the saved user message
        return ResponseEntity.ok(savedMessage);
    }

    @GetMapping("/{chatId}")
    public ResponseEntity<List<Message>> getAllMessages(@PathVariable Long chatId) {
        List<Message> messages = messageService.getAllMessages(chatId);
        
        // Check if any messages were found
        if (messages.isEmpty()) {
            return ResponseEntity.noContent().build(); // Return 204 No Content if no messages found
        }
    
        return ResponseEntity.ok(messages); // Return the list of messages with 200 OK
    }
    

    // @GetMapping("/botResponses")
    // public List<Message> getBotResponses(@RequestParam Long chatId, @RequestParam String afterTimestamp) {
    //     LocalDateTime timestamp = LocalDateTime.parse(afterTimestamp);
    //     return messageService.getBotResponses(chatId, timestamp);
    // }

    @MessageMapping("/chat.sendMessage")
    public void postMessage(Message message) {
        // Save the message to the database
        Message savedMessage = messageService.sendMessage(message);

        // Broadcast the message to all subscribers in the chat room
        messagingTemplate.convertAndSend("/topic/chat/" + savedMessage.getChat().getId(), savedMessage);
    }
}

