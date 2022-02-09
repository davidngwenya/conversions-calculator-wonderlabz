# conversions-calculator-wonderlabz
An Application to calculate conversions for temperature readings (Celsius <-> Kelvin) and distance values (Miles <-> Kilometers).

The Application is meant to calculate temperature conversions between Celsius and Kelvin values (and vice-versa), where a user will input values of either one of the two temperature readings and the corresponding equivalent will be calculated and displayed to the user. 

The same feature will also be available for distance conversions between Miles and Kilometres and (vice-versa), where agaian, a user can input either one of the two distance readings and the corresponding will be displayed to the user.

Even though the precision of the calculations has been reduced to two decimal places, this is nonetheless still sufficient to get a fairly accurate conversion value.

Limitations Of The Application:
1. The Application is only capable of two types of conversions, that is, Temperature Conversions (Celsius <-> Kelvin) and Distance Conversions(Miles <-> Kilometres).
2. It has a reduced accuracy precision of two decimal places for calculated values.
3. It is only accessible via a browser.
4.

Architecture of The Application:
The Application has both a Front-End and a Back-End. The Front-End is meant to give users an interface to make the necessary conversions as per their requirements and the Back-End is meant to provide a secure environment to service user requests via a conversion service.

The Front-End consists of a GUI to capture values and to display results of their desired conversions. It will have the following features:
1. A capture form to input values that require conversion.
2. A display to output the results of conversions done.
3. The ability to store all conversions done for future reference.
4. A view to list all of the conversions done by the Application.
5. An application login feature to provide a personal user experience.

The Back-End consists of a Database and Servers which will provide a convenient setup for smooth communication between the front-end and the back-end. It will include the following:
1. A Database
2. A Gateway Server throught which requests from the front-end will initially pass throuth to the backend.
3. A Service Discovery Server (Eureka Server) which will register services that will be developed and make them easy available to be looked up or searched on request from the frontend.
4. Config Server which will provide a central place to get updated config information from property files within a repository and make this info readily available to manage across different environments.
