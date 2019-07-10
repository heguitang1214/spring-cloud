package com.tang.stream.source;

import com.tang.stream.source.SendMessage2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SourceOrderController {

//    @Autowired
//    private SendMessage1 sendMessage1;

    @Autowired
    private SendMessage2 sendMessage2;

    @GetMapping("/source/sendMessage")
    public String sendShopMessage(String content) {
//        sendMessage1.sayHello("okokok");
        sendMessage2.sayHello("okokok");
        return "success";
    }

}
