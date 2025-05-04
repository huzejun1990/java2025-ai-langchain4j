package com.dream.java2025.ai.langchain4j.config;

import com.dream.java2025.ai.langchain4j.assistant.MemoryChatAssistant;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author huzejun
 * @Date 2025-05-04 21:09
 **/

@Configuration
public class MemoryChatAssistantConfig {

    @Bean
    public ChatMemory chatMemory(){
        return MessageWindowChatMemory.withMaxMessages(10);
    }

}
