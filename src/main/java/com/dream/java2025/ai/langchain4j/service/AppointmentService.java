package com.dream.java2025.ai.langchain4j.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dream.java2025.ai.langchain4j.entity.Appointment;

/**
 * @Author huzejun
 * @Date 2025-05-08 15:38
 **/
public interface AppointmentService extends IService<Appointment> {

    Appointment getOne(Appointment appointment);

}
