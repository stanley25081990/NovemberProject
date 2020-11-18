@TaskTest
Feature: validate flipkart item

Scenario: validate cost of samsung mobile and add it to cart
Given open firefox browser
When enter URL as https://www.flipkart.com/
Then close popup 
When type samsung in search box and hit enter
Then get the title and price of the first link
When click the first link
Then switch to the first window
Then get the title and price of the searched mobile
When price of the searched mobile matches with the source
Then click on go to cart
When price of the added cart is same as previous
Then click on place order
 