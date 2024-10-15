package com.examplemicroservicioreportes.controller;

import com.examplemicroservicioreportes.dto.ActivityReportDTO;
import com.examplemicroservicioreportes.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping("/report/{apprenticeId}/{month}/{year}")
    public ResponseEntity<ActivityReportDTO> getMonthlyReport(
            @PathVariable("apprenticeId") String apprenticeId,
            @PathVariable("month") int month,
            @PathVariable("year") int year) {

        ActivityReportDTO report = activityService.getMonthlyReport(apprenticeId, month, year);
        return ResponseEntity.ok(report);
    }
}
