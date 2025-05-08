package com.dream.java2025.ai.langchain4j;

import com.dream.java2025.ai.langchain4j.entity.Appointment;
import com.dream.java2025.ai.langchain4j.service.AppointmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author huzejun
 * @Date 2025-05-08 15:49
 **/
@SpringBootTest
public class AppointmentServiceTest {

    @Autowired
    private AppointmentService appointmentService;

    @Test
    void testGetOne() {
        Appointment appointment = new Appointment();
        appointment.setUsername("张三");
        appointment.setIdCard("123456789012345678");
        appointment.setDate("2025-5-8");
        appointment.setTime("上午");
//        appointment.setDoctorName("张医生");

        Appointment appointmentDB = appointmentService.getOne(appointment);
        System.out.println(appointmentDB);
    }

    @Test
    void testSave() {
        Appointment appointment = new Appointment();
        appointment.setUsername("张三");
        appointment.setIdCard("123456789012345678");
        appointment.setDepartment("内科");
        appointment.setDate("2025-5-8");
        appointment.setTime("上午");
        appointment.setDoctorName("张医生");

        appointmentService.save(appointment);

    }

    @Test
    void testRemoveById() {
        appointmentService.removeById(1L);
    }


}
