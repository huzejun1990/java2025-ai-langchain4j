package com.dream.java2025.ai.langchain4j;

import com.dream.java2025.ai.langchain4j.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author huzejun
 * @Date 2025-05-07 11:33
 **/

@SpringBootTest
public class ToolsTest {

    @Autowired
    private SeparateChatAssistant separateChatAssistant;

    @Test
    public void testCalculatorTools() {

        String answer = separateChatAssistant.chat(99, "1+2等于几，475695037565的平方根是多少？");
        // 1+2等于3呀😉。475695037565的平方根嘛，这个数老大的，我帮你算一算啊...大概是689689.25左右吧
        //√(475695037565) = 689706.486532
        // 1+2等于3呀😉！至于475695037565的平方根，准确点讲是大约689706.49左右哦
        System.out.println(answer);
    }


}
