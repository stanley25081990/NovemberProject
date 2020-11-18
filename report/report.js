$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/task.feature");
formatter.feature({
  "name": "validate flipkart item",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TaskTest"
    }
  ]
});
formatter.scenario({
  "name": "validate cost of samsung mobile and add it to cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TaskTest"
    }
  ]
});
formatter.step({
  "name": "open firefox browser",
  "keyword": "Given "
});
formatter.match({
  "location": "testCases.FlipkartTaskMethods.open_firefox_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter URL as https://www.flipkart.com/",
  "keyword": "When "
});
formatter.match({
  "location": "testCases.FlipkartTaskMethods.enter_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close popup",
  "keyword": "Then "
});
formatter.match({
  "location": "testCases.FlipkartTaskMethods.close_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type samsung in search box and hit enter",
  "keyword": "When "
});
formatter.match({
  "location": "testCases.FlipkartTaskMethods.type_samsung_in_search_box_and_hit_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get the title and price of the first link",
  "keyword": "Then "
});
formatter.match({
  "location": "testCases.FlipkartTaskMethods.get_the_title_and_price_of_the_first_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the first link",
  "keyword": "When "
});
formatter.match({
  "location": "testCases.FlipkartTaskMethods.click_the_first_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "switch to the first window",
  "keyword": "Then "
});
formatter.match({
  "location": "testCases.FlipkartTaskMethods.switch_to_the_first_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get the title and price of the searched mobile",
  "keyword": "Then "
});
formatter.match({
  "location": "testCases.FlipkartTaskMethods.get_the_title_and_price_of_the_searched_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "price of the searched mobile matches with the source",
  "keyword": "When "
});
formatter.match({
  "location": "testCases.FlipkartTaskMethods.price_of_the_searched_mobile_matches_with_the_source()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on go to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "testCases.FlipkartTaskMethods.click_on_go_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "price of the added cart is same as previous",
  "keyword": "When "
});
formatter.match({
  "location": "testCases.FlipkartTaskMethods.price_of_the_added_cart_is_same_as_previous()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on place order",
  "keyword": "Then "
});
formatter.match({
  "location": "testCases.FlipkartTaskMethods.click_on_place_order()"
});
formatter.result({
  "status": "passed"
});
});