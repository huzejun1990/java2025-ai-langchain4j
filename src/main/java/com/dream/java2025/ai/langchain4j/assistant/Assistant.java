package com.dream.java2025.ai.langchain4j.assistant;

import dev.langchain4j.service.spring.AiService;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

/**
 * @Author huzejun
 * @Date 2025-05-04 13:30
 **/
@AiService(wiringMode = EXPLICIT,chatModel = "qwenChatModel")
public interface Assistant {

    String chat(String userMessage);
}
