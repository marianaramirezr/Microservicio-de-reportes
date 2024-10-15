package com.examplemicroservicioreportes.dto;
import com.examplemicroservicioreportes.model.Activity;

import java.time.LocalDate;
import java.util.List;

public class ActivityReportDTO {

    private String apprenticeId;
    private String apprenticeName;
    private List<WeekReport> weeks;


    public static class WeekReport {
        private String week;
        private List<ActivityDTO> activities;

    }

    public static class ActivityDTO {
        private String trainingDate;
        private String trainingType;
        private String trainingName;

    }
}