$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/PatientGrid/Schedule_Module.feature");
formatter.feature({
  "name": "Scheduled Left Filters flow",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Visit Type Filters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeUSMM_VerifyVisitTypeFilter"
    }
  ]
});
formatter.step({
  "name": "I click on schedule left filters reset button",
  "keyword": "When "
});
formatter.step({
  "name": "I Search \u003cVisitType\u003e as schedule visit type",
  "keyword": "* "
});
formatter.step({
  "name": "I click on schedule apply button",
  "keyword": "* "
});
formatter.step({
  "name": "I hover over the created appointment",
  "keyword": "* "
});
formatter.step({
  "name": "I should see \u003cVisitType\u003e as VisitType",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "VisitType"
      ]
    },
    {
      "cells": [
        "Telehealth"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to patient grid With Schedule",
  "keyword": "Given "
});
formatter.match({
  "location": "SD_PatientGrid_ScheduleTab.I_navigate_to_patient_grid_Schedule()"
});
