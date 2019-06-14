package com.test.greyfinch.schedule;

import com.test.greyfinch.dto.BirdReserveDTO;
import com.test.greyfinch.model.BirdReserve;
import com.test.greyfinch.repository.BirdReserveRepository;
import com.test.greyfinch.service.BirdReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class ScheduledTasks {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Autowired
    private BirdReserveRepository repository;



    @Scheduled(fixedRate = 5000)
    public void scheduleTaskWithFixedRate() {
        System.out.println("Export to pdf... :: Execution Time -" + dateTimeFormatter.format(LocalDateTime.now()));
        repository.findAll().stream().forEach(System.out::println);
    }

}