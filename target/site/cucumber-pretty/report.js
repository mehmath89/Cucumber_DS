$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MainPage.feature");
formatter.feature({
  "line": 3,
  "name": "Darksky page feature",
  "description": "",
  "id": "darksky-page-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 6122340253,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on darksky page",
  "keyword": "Given "
});
formatter.match({
  "location": "MainPageSD.getUrl()"
});
formatter.result({
  "duration": 603662511,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Check today\u0027s highest and lowest temprature on darksky page",
  "description": "",
  "id": "darksky-page-feature;check-today\u0027s-highest-and-lowest-temprature-on-darksky-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@darksky"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I enter a city as Dayton into the search box on the darksky page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on search button on the darksky page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I got current temperature on the darksky page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click Today button on the darksky page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I got highest and lowest temperature and verify them on the darksky page",
  "keyword": "Then "
});
formatter.match({
  "location": "MainPageSD.sendAValueIntoSearchBox()"
});
formatter.result({
  "duration": 223580236,
  "status": "passed"
});
formatter.match({
  "location": "MainPageSD.clickTheSearchBtn()"
});
formatter.result({
  "duration": 97682257,
  "status": "passed"
});
formatter.match({
  "location": "MainPageSD.gettingCurrentTemp()"
});
formatter.result({
  "duration": 3036636770,
  "status": "passed"
});
formatter.match({
  "location": "MainPageSD.clickTodayBtn()"
});
formatter.result({
  "duration": 1597092702,
  "status": "passed"
});
formatter.match({
  "location": "MainPageSD.getHighestAndLowestThenVerify()"
});
formatter.result({
  "duration": 4270279840,
  "status": "passed"
});
formatter.after({
  "duration": 239155655,
  "status": "passed"
});
});