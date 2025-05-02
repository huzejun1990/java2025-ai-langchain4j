package com.dream.java2025.ai.langchain4j;

import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author huzejun
 * @Date 2025-05-01 18:01
 **/

@SpringBootTest
public class LLMTest {

    @Test
    public void testGPTDemo(){
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .build();

//        String answer = model.chat("你好");
        String answer = model.chat("你是谁呀！");
        System.out.println(answer);

    }

    @Autowired
    private OpenAiChatModel openAiChatModel;


    @Test
    public void testSpringBoot() {
        String anwser = openAiChatModel.chat("我是谁");
        System.out.println(anwser);

    }

}
