package com.dream.java2025.ai.langchain4j.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import reactor.core.publisher.Flux;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

/**
 * @Author huzejun
 * @Date 2025-05-06 19:13
 **/
@AiService(
        wiringMode = EXPLICIT,
        /*chatModel = "qwenChatModel",*/
        streamingChatModel = "qwenStreamingChatModel",
        chatMemoryProvider = "chatMemoryProviderDaZhi",
        tools = "appointmentTools",
        contentRetriever = "contentRetrieverDaZhiPincone"
)
public interface DazhiAgent {

    @SystemMessage(fromResource = "dazhi-prompt-template.txt")
    Flux<String> chat(@MemoryId Long memoryId, @UserMessage String userMessage);
}
