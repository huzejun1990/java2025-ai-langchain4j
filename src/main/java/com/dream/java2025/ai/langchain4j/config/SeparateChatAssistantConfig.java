package com.dream.java2025.ai.langchain4j.config;

import com.dream.java2025.ai.langchain4j.store.MongoChatMemoryStore;
import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.store.memory.chat.InMemoryChatMemoryStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author huzejun
 * @Date 2025-05-04 22:53
 **/

@Configuration
public class SeparateChatAssistantConfig {

    @Autowired
    private MongoChatMemoryStore mongoChatMemoryStore;


    @Bean
    public ChatMemoryProvider chatMemoryProvider() {

        return memoryId -> MessageWindowChatMemory
                .builder()
                .id(memoryId)
                .maxMessages(10)
//                .chatMemoryStore(new InMemoryChatMemoryStore())   //写入内存
                .chatMemoryStore(mongoChatMemoryStore)      //写入磁盘
                .build();

    }
}
