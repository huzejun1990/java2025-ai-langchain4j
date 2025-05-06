package com.dream.java2025.ai.langchain4j;

import com.dream.java2025.ai.langchain4j.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author huzejun
 * @Date 2025-05-06 15:16
 **/

@SpringBootTest
public class PromptTest {

    @Autowired
    private SeparateChatAssistant separateChatAssistant;


    @Test
    public void testSystemMessage() {
        String answer = separateChatAssistant.chat(5, "今天几号");
        System.out.println(answer);
    }


}
