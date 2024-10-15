package com.examplemicroservicioreportes.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "activities")
public class Activity {

    @Id
    private String id;

    private String apprenticeId;

    private String apprenticeUsername;

    private String trainerId;

    private String trainingName;

    private LocalDate trainingDate;

    private String trainingType;

    private int durationMinutes;
}