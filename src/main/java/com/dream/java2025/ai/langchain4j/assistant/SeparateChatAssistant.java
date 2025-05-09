package com.dream.java2025.ai.langchain4j.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

/**
 * @Author huzejun
 * @Date 2025-05-04 22:43
 **/

@AiService(
        wiringMode = EXPLICIT,
        chatModel = "qwenChatModel",
        chatMemoryProvider = "chatMemoryProvider",
        tools = "calculatorTools"   //配置工具
)
public interface SeparateChatAssistant {
    // my-prompt-template.txt

    @SystemMessage(fromResource = "my-prompt-template.txt")
        //系统消息提示词
//    @SystemMessage("你是我的好朋友，请用东北话回答问题。今天是{{current_date}}")    //系统消息提示词
//    @SystemMessage("你是我的好朋友，请用粤语回答问题。")    //系统消息提示词
    String chat(@MemoryId int memoryId, @UserMessage String userMessage);


    @SystemMessage("你是我的好朋友，请用粤语回答问题。{{message}}")
        //系统消息提示词
    String chat2(@MemoryId int memoryId, @V("message") @UserMessage String userMessage);

    @SystemMessage(fromResource = "my-prompt-template3.txt")
    String chat3(
            @MemoryId int memoryId,
            @UserMessage String userMessage,
            @V("username") String username,
            @V("age") int age
    );
}
