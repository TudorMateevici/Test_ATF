@API
Feature: API testing

@TC_3_POST_CALL
Scenario: Create a new booking
Given authentication API call done
When a POST request is sent with the proper json file
Then new record created successfully and status code 200 with booking ID are returned in response

@TC_4_GET_CALL
Scenario: Retrieve information about a created booking
Given a POST request already done
When a GET request is sent to endpoint "/booking" with the required booking id
Then in response all info related to the used booking id should be displayed

@TC_5_DELETE_CALL
Scenario: Delete information about a created booking
Given a POST request already done
When a DELETE request is sent to endpoint "/booking" with the required booking id
Then in response status code 201 with message: "Created" should be displayed