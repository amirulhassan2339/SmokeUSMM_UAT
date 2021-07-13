$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/PatientGrid/CarePlan/Blank.feature");
formatter.feature({
  "name": "Care Plan - Blank",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Blank"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify reject status function using save button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeUSMM_RejectedSaveBtn_Blank"
    }
  ]
});
formatter.step({
  "name": "I search \u003cPatient\u003e using global search",
  "keyword": "When "
});
formatter.step({
  "name": "I am on PWB",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on care plan tab",
  "keyword": "And "
});
formatter.step({
  "name": "I click on add new care plan button",
  "keyword": "And "
});
formatter.step({
  "name": "I click on blank",
  "keyword": "And "
});
formatter.step({
  "name": "I should see patient \u003cPatient\u003e as patient_name",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see intial status as \u003cNew Status\u003e on CP header",
  "keyword": "And "
});
formatter.step({
  "name": "I enter title \u003cTitle\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I select work in progress as no",
  "keyword": "And "
});
formatter.step({
  "name": "I click on save button",
  "keyword": "And "
});
formatter.step({
  "name": "I should see success message \u003cSucessMessage\u003e of CP",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see patient \u003cPatient\u003e as patient_name",
  "keyword": "* "
});
formatter.step({
  "name": "I should see patient data of draft status",
  "keyword": "And "
});
formatter.step({
  "name": "I should see status as \u003cDraft Status\u003e on CP header",
  "keyword": "And "
});
formatter.step({
  "name": "I click on reject button_Blank",
  "keyword": "When "
});
formatter.step({
  "name": "I should see rejected alert popup",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on proceed button",
  "keyword": "And "
});
formatter.step({
  "name": "I should see rejected success message",
  "keyword": "And "
});
formatter.step({
  "name": "I click on title from care plan grid",
  "keyword": "When "
});
formatter.step({
  "name": "I should see patient \u003cPatient\u003e as patient_name",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see patient data as read only",
  "keyword": "And "
});
formatter.step({
  "name": "I should see reject status as \u003cRejected Status\u003e on CP header",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Patient",
        "Title",
        "New Status",
        "Draft Status",
        "Rejected Status",
        "SucessMessage"
      ]
    },
    {
      "cells": [
        "Dermo505, Mac505",
        "RejectedPatient",
        "New",
        "Draft",
        "Rejected",
        "successCare Plan Saved SuccessfullyHide"
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
  "name": "I navigate to patient grid",
  "keyword": "Given "
});
formatter.match({
  "location": "SD_PatientGrid.I_navigate_to_patient_grid()"
});
