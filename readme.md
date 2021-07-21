## Travel Automation
@author - Biswajit Sundara

### API details
baseUrl = https://api.spacexdata.com
endPoint = /v4/launches/latest

### How to setup the project
* Clone the repository
* API data is available here `src\test\java\appl\api\APIDetails.java` 


### How to Execute the tests
* Run `mvn clean test` and it will execute the test


### Viewing the Test Results
* Extent Report can be accessed here `spacex-automation\Report.html`
* Surefire report can be found here - `spacex-automation\target\surefire-reports`


### Automated TestCase
* I have validated the status code and content type
* I have validated few key areas such as the rocket details, launch and landing details

### Possible Automated Scenarios
* We can create pojo classes and set the expected values and the validate against the response.
* We can also do complete json to json comparison (not ideal always as there are dynamic field data usually)
* We can use testng data providers or integrate this with cucumber and then pass data from feature file.