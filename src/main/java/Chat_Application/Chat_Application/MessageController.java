package Chat_Application.Chat_Application;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message) {
        String msg = message.getContent();
        System.out.println(message.getContent());
        return message;
    }

}