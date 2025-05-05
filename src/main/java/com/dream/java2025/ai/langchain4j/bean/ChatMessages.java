package com.dream.java2025.ai.langchain4j.bean;

import io.github.classgraph.json.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author huzejun
 * @Date 2025-05-05 16:07
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("chat_messages")
public class ChatMessages {

    //唯一标识，映射到 MongoDB 文档的 _id 字段
    @Id
    private ObjectId messageId;


    private String content; //存储当前聊天记录列表的json字符串
}
