package com.dream.java2025.ai.langchain4j.controller;

import com.dream.java2025.ai.langchain4j.assistant.DazhiAgent;
import com.dream.java2025.ai.langchain4j.bean.ChatForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huzejun
 * @Date 2025-05-07 9:05
 **/
//@Tag(name = "北京大智")
@Tag(name = "企业大智")
@RestController
@RequestMapping("/dazhi")
public class DazhiController {

    @Autowired
    private DazhiAgent dazhiAgent;

    @Operation(summary = "对话")
    @PostMapping("/chat")
    public String chat(@RequestBody ChatForm chatForm) {
        return dazhiAgent.chat(chatForm.getMessageId(),chatForm.getMessage());
    }

}
