Functional specification
=======================
Table of contents
------------------

1 - Introduction
1.1 - Overview
 	1.2 - Business context
1.3 - Glossary of terms
1.4 - Research references

2 - General description.
2.1 - Product/system functions
2.2 - User characteristics and objectives
2.3 - Operational scenarios
2.4 - Constraints

3- Functional requirements
3.1 - Sign up/register
3.2 - Create profile
3.3 - Log in
3.4 - View graph
3.5 - Hardware

4 - System architecture diagram

5- High level design
5.1-  Context diagram
5.2 - Cata flow diagram
5.3 - Flow diagram
5.4 - Use case diagram

6- Preliminary schedule
6.1 - Task list
6.2 - Gantt chart

7 - Appendices
7.1 Medical research resources. 








1 -   Introduction:
====================


1.1   –Overview
 -------------------
We are developing a mobile phone app that works with wearable sensors to detect the physiological symptoms of anxiety attacks. We will use sensors to track the physiological effects of the stress response and use an algorithm to decipher when a user is experiencing an anxiety attack as opposed to mild stress or exercise etc, it will then:
1) Launch a graphic with helpful advice for the user. 
This advice will be time and location specific i.e. It will not suggest to have a cup of tea if the user is experiencing an anxiety attack at 2am.
2) The app will graph the anxiety attack and all the data around it, which will be shared with the users therapist. This will allow the user and the therapist to see over time the frequency of these attacks and see if the therapy is effective or not. It will also allow the user and therapist to identify triggers for the users anxiety attacks.
 
Need for the system.
In therapy for anxiety the treatments focus on the psychological approach. Psychologists are aware of the physiological effects of anxiety attacks but to date the information has remained unused. At most it’s used in diagnosing some with an anxiety condition. What we aim to do with our app is to take the decades of research and knowledge about the physiological aspects of the disorder and use it to allow a more effective therapy treatment and allow the patient to maintain their mental health once they leave therapy.
We have met with psychologists and they have agreed that if the system works as planned then it would be a very beneficial tool for therapy.
 
Interaction with other systems:
The app will communicate with different sensors on the patients person. It will create an image of the patients experiences in real time and use those to decide whether the user is experiencing an anxiety attack.
 


1.2 - Business context.
 ----------------------
There are many parties that would be interested in this app. Predominantly it would be sufferers of an anxiety disorder and therapists interested in more comprehensive ways of treating their patients. At the moment there is nothing like this available on the market and with the ever growing rise in diagnosis of anxiety disorders, technology like our app could become commonplace.
Anxiety disorders are the most common mental illness in the world today, affecting 40 million adults in the United States alone. Women have double the risk for anxiety disorders than men do. It can be a debilitating condition affecting all areas of a person's life. According to the NHS U.K, Anxiety is defined as a feeling of unease, such as worry or fear, that can be mild or severe. Everyone has feelings of anxiety at some point in their life – for example, you may feel worried and anxious about sitting an exam, or having a medical test or a job interview. During times like these, feeling anxious can be perfectly normal. However, some people find it hard to control their worries. Their feelings of anxiety are more constant and can often affect their daily lives. During an anxiety attack, people may feel fearful, apprehensive, may feel their heart racing or feel short of breath. It’s clear that some events, emotions, or experiences may cause symptoms of anxiety to begin or may make them worse. These elements are called triggers. Anxiety triggers can be different for each person. But for some people, anxiety attacks can be triggered for no reason at all.
 

1.3 - Glossary of terms:
 ------------------------------
MYSQL: MYSQL is an open source RDBMS that relies on SQL for processing the data in the database. 
Triggers: Anything that provokes a memory or impulse.


1.4 - Research references:
 --------------------------
Medical Research papers prove that anxiety can be measured by sensors. The most effective way is through a combination of respiration and heart rate monitoring.
“A combination of heart rate monitoring and respiration is apparently the best
proven way to monitor stress. anxieties 2 biggest physical symptoms are
increased heart rate and hyperventilation so these are solid metric for anxiety detection but there are others.
''Standard deviations (SDs) of these  measurements, as  well  as 
other  measurements  of  their  variability,  have been  frequently  used  to characterize respiratory
variability, which seems to be negatively correlated to anxiety''
 
https://www.ncbi.nlm.nih.gov/pmc/articles/PMC4631393/?fbclid=IwAR0TOvWjGB_7wsy3fUumqtMlPF3qG8YiVoNdkdT4kEqM4dTBCXvNjNTtudg


2 -  General description
 ==============================
2.1 - Product/system functions.
 ------------------------------
User functionality system:
A user will download the app and attach the necessary sensors. The user will create a profile  by registering and filling in some basic health details such as age,bmi, blood pressure etc. The system will calibrate the anxiety attack physiological symptoms parameters with this data.
The user will connect the therapist to there account so that the therapist sees the graph information of the user.
The sensors will send the data to the app via the Api’s, the apps algorithm will combine the different sensors data in real time to create an image of the user experience. Then the app will decide the best course of action based on the probability that the given user experience is an anxiety attack or not. The data will then be logged in an csv file to be graphed. A database is maintained to store all the data around the user experience to help the therapist.
 
Therapist functionality
The therapist will create a therapist account that can be connected to multiple patients accounts. The therapist account has in depth detailed graphs instead of the basic time graph that the patient has.
 
Sensor functionality
There will be a number of sensors that will send data to the app to create the user experience model. Such as
Respiration Sensor.
Heart Rate/Blood Pressure Sensors.
Skin Conductance Sensor.
Core Body Temperature and Surface Body Temperature Sensors.
Accelerometer

 Algorithm for sensor data:
An algorithm will be needed to determine if the user is experiencing an anxiety attack or is exercising etc, we will use probability and statistics in python calculate the probability of it being an anxiety attack based on the criteria and using that result make a suggestion to the user.
In order to make an efficient algorithm we will need to do an enormous amount of medical research into the specific markers of anxiety to differentiate it from exercise or other user experiences. Then taking the testing results into account to refine the algorithm.
 
Algorithm for anxiety attack response:
An algorithm will be needed for the suggestions that takes account of the time and location of the user in giving suggestions.
i.e tea will be suggested if it’s 2pm but not if its 2am.
If the user is in a crowded public place meditation will not be advised but if they are at home it will be.
 
 
Cloud storage.
For therapists and storing the users graph. This requires encryption.
 

2.2 – User characteristics and objectives:
-----------------------------------------------
The user community consists of 
Users with an anxiety disorder,
Therapists.


1. Users with anxiety. 
The needs of this group is for a simple easy to use and non-complex app that does not add to there stress.
The notifications should be insightful and helpful to the user. This is an automated system that requires little interaction from the user outside of the initial setup. The app runs in the background of the phone and is constantly receiving the sensor information.

The users come from a variety of backgrounds and will have a mixed technological expertise so a simple intuitive app is important for it to be effective. The objectives for this group is that this system will help them manage their anxiety in the long run but also help bring a mindful awareness of their day to day experiences. It will also improve the effectiveness of the patients therapy, which will hopefully allow the therapy to hit recovery milestones faster and more smoothly than it might have without this technology.
The requirements that this user would expect is ease of use, effectiveness and a certain level of convenience. A manufacturer can obviously produce a more convenient and lightweight sensor system than we can but considering this is a student project with no funding, the sensors will be essentially ‘homemade’. A wish list for this would be professionally produced sensors specifically designed for this app and these users in mind.
 
 
2) Therapists. 
This version is more technical in its representation of data of the patient but still needs to be simple and intuitive as psychologists, though they are well educated, have mixed technological expertise. A tutorial video would be part of a wish list of a completed app that would guide the therapist through the system and help them understand the data and its relevance to the patient.
The objectives for this group is to have an app that is as beneficial to their patients as possible while improving their ability to understand the patients experiences and understand the impact of the treatment on the patient.
The requirements of this group is relevant information that they can easily read and understand that can be translated into the treatment for the user.
 
 
 
 
2.3- Operational scenarios.
----------------------------------
 
Different user levels: client, therapist. User experiencing anxiety attack. this app is very niche in its focus so we will not have many operational scenarios. We will not have curious users without anxiety because there is too much investment required and to get full functionality out of the app the user needs to connect a verified therapist.
 
Client will download app and register to create a profile. they will be fill in some basic information to help calibrate the algorithm and sensor data. The functions to complete this users goal are:



1. Client user
 
Register:
Fill in client information: basic info to calibrate settings.
Connect sensors to the app: ensure connection and proper function.
Connect a therapist: This will allow the client to connect to his therapist.
 
View graph:
This allows a user to view a graph that represents a basic version of the data about the anxiety attacks. The client version will only have time  and date of anxiety attack to prevent anxiety behaviours around the graph data itself.
 
 
 
2. Client user experiencing anxiety:

Notification on experiencing anxiety attack:
The sensors will register the anxiety attack and the app will log all the user data and update the graph. The user will receive time and location specific advise on how to help deal with the anxiety attack.

The therapist user will have a different version of the same app.
 
Register:
The therapist must register a therapist account to get a verified status. This would be a wish list functionality that would include a team that would review therapist applications to ensure that they are properly qualified therapists.
 
Clients:
A therapist can see a list of all of his clients that are connected with the app. He can view there details at any time to facilitate the therapy process.
 
View graphs:
The therapist can view in depth graph data that includes all the data collected on the user including about anxiety attacks but also all the info around them and day to day data.
 

2.4 - Constraints
 --------------------------
1. Physiological anxiety model
The largest constraint is developing a physiological model of anxiety. This has never been done in any useful detail so we will essentially have to invent it. The model is how the different physiological responses correlate with each other in response to the anxiety attack. This is a very achievable goal but could be hindered by the time constraints we have for this project. To develop an accurate physiological anxiety model would require sufficient testing with a large base of users and then fine tuning the algorithm to the results of these results.
 
2. Database Memory
Due to the limit on our server account and MYSQL account, we have a limit on the scale on which we can test the project. We will be unable to test the product on the scale that it would possibly grow to in time, and would face problems later on, as more and more people sign up.
 
3. Speed:
It’s important given the nature of the condition that the app is fast and operates in real time effectively. This will require testing, the right use of algorithms and apis.
 
4. Ethical approval and issues:
We need to get ethical approval for tracking the users data. for this project we will be using ourselves as the testers to avoid having to get comprehensive ethical approval and appropriate test subjects. There may be issues in development with ethical issues relating to restricting a users access to the data collected on them. Its not advisable for an anxious person to have full access to the anxiety graph information that the therapist has access to because this can lead to the development of avoidant behaviours in the anxious client. They will see for example that they have had anxiety attacks in crowded places, they will then avoid crowded places or large groups of people. This will make there mental health worse instead of helping them recover. As part of a wish list we may add a terms and conditions of use of the app is that the client cannot access there full data unless the therapist agrees and grants permission from there app.



3 - Functional Requirements
============================
3.1- Sign Up/Register:
-----------------------------------
Description:
This is the initial screen that the Client or their Therapist will be introduced to. It will prompt the them to sign up/ register for the app. The user will input mandatory information in the fields required (such as name, age etc).This could be different depending on whether the user is a Therapist or a Client.  Another option will also exist on the screen enabling users who have already registered to log in instead.  

Criticality:
This is vitally essential requirement for the entire system as it enables the developer to identify each user of the application. Without this stage, users will not be able to view their own graph to see their progress and their therapist will not be able to view the graph specific to their client. 


Technical Issues:
Technical issue that we might encounter would be linking the information acquired from the user with our database and making sure that there are no duplicates(i.e two John Edwards, born on the 16th of January 1993, with different addresses). This means we must minimise the chances of such events happening by taking the necessary precautions. 

Dependencies with other requirements:
Failure to register will result in the user not being able to access the underlying features of the application. Features such as graphs (as mentioned above). This will also hinder the Clients therapy as they will be unable to use the application and their therapist will not be able to view the Client’s progress.

3.2 - Create Profile 
----------------------------
Description: 
When the user has completed the registration process, a profile will be created with their  name and all the information they had keyed in in the initial stage of the application. This profile will allow the user to add more information about themselves which such as address, nationality etc. An option will also exist in this stage to add a Therapist using for example, their name and name of clinic. This will then create a link between the therapist and the client.

Criticality:
This is an essential aspect of the entire system as the user profile is created by turning the information gathered from the registration phase into a profile where the user of the application can view what they added during the registration, thus allowing the user to make changes if mistakes exist. Depending on whether the user is a Client or a Therapist, information provided could differ in size. (i.e, a therapist profile will not need age and interest). 

Technical issues:
Issues may arise with the way in which the data is handled in the backend  and how the app interacts with the database when the user wishes to only display their profile or whether the user wishes to update their profile. (i.e update their location). This means our application will have to communicate with our database to update the information provided from the front end.

Dependencies with other requirements: 
This area is heavily dependant on the initial registration phase and the following stages also depend on the user having a profile while utilising the app.

3.3 - Log in
-----------------
Description:
This stage integrates the information gathered from the previous two stages and enables the user to log into their personal area of the application. The application will launch a simple screen prompting the user to input information such as name and password in order for them to view own information. If the user is a Therapist, he/she will be able to view the information of only their own clients who have added them as their Therapist.

Criticality:
This is a highly critical area as it unlocks the important features in the application (such as the graph). After the user has input their detail, it will also unlock useful features that will pop up on their smartphone telling the Client to calm down whenever, they are experiencing an anxiety attack. Without the user Log in, the application will not be able to function effectively. 

Technical issue:
The technical issue associated in this function is that the front end of the application must also communicate with the back-end database. Once the user has input their password, the application must then communicate with  the database to check if the password and username is present and if the password and username have been inserted correctly(i.e must take into consideration lowercase or uppercase and special characters).

Dependencies with other requirements:
The subsequent functionalities are highly dependant on this stage. Without this function, the subsequent function will not exist in the application.

3.4 -View Graph
--------------------
Description:
Here, both the Client and the Therapist will be able to view their graphs respectively. However, the graph displayed will be different depending on whether the user is a client or a therapist. This functionality will display a basic graph to the client with the sole aim of improving ang managing their anxiety. Whilst the Therapist will have a more detailed graph which will contain all the user’s data (i.e when they had an anxiety attack, the frequency of the attacks and much more). The Client and the Therapist will be able to view graphs using a cloud server to store the data. 

Criticality:
The functionality mentioned here is vital for helping the client to overcome their anxiety and reducing the frequency of the anxiety attacks the Client receives normally. 

Technical issue:
The main technical issues here would be to adapt our application to communicate with a cloud server. This will allow the Therapist to also view the progress of his/her client. Another technical issue would be acquiring all the data and filtering them in order to display only the data that is relevant to either the client or the therapist alone.

Dependencies with other requirements:
This functionality is heavily dependant of the hardware as the data that will be used for this application will be gathered using a number of fitness sensors. 



HardWare

3.5 - Sensors:
------------------------
Description:
This is the hardware component that works in conjunction with the application. We will be using a series of fitness sensors such as Fitbit, respirational sensors etc, to gather the information needed. This information will then be used to formulate a graph whereby both the Therapist and the Client can view.  Using special API’s we will be able use information gathered from the fitbit at real time to send a message on our application, to the client to “calm down” when the client's heart rate is high. This is a common signal that a person is having an anxiety attack.

Criticality:
The use of sensors is a vital addition to the app as without it, the user will not be able to view accurate graph results. As mentioned above, the information we gather from these sensors will assist us in making an efficient algorithm that will provide a suitable graph for the users. 

Technical issue:
One technical issue would be contacting sensor API’s in real time. 

Dependencies with other requirements:
None




















4 - System architecture:
==========================
![](/Markdown_images/System_Architecture.png)


5 - High level design
======================



Context diagram:
------------------------
This diagram shows how the system interacts with its external entities to the system, clients and therapists, to show the follow of information between the system and these entities. 
![](/Markdown_images/Context_Diagram.png)






Data Flow Diagram:
-------------------------

This diagram shows where data comes from and where data goes in a system.
![](/Markdown_images/DFD.png)

















Simple High Level Diagram:
---------------------------
![](/Markdown_images/HighLevelDiagram.png)

Use Case Diagram:
-------------------
This diagram shows how user interactions with the system.
![](/Markdown_images/UseCaseDiagram.png)




6.Preliminary Schedule .
========================
This section provides an initial version of the project timeline plan through the use of a Gantt chart, with the project tentative start and stop dates. 

The schedule below was designed using Microsoft Project. (Fig A) shows a full list of tasks and (Fig B) shows the plan of how and when these tasks are to be completed. So on the task list chart/table it shows the task name, duration, start and finish dates and with the team members who are going to complete the specific task. On the Gantt chart is a more visual display of the information contained in the task list. It shows each task a bar or line, and its relation to previous tasks.

Figure A:
---------------------
![](/Markdown_images/FigureA.png)












Figure B:
-----------
![](/Markdown_images/FigureB.png)



7 - Appendices
===================
Research links:

https://www.ncbi.nlm.nih.gov/pmc/articles/PMC4631393/?fbclid=IwAR0TOvWjGB_7wsy3fUumqtMlPF3qG8YiVoNdkdT4kEqM4dTBCXvNjNTtudg
https://www.researchgate.net/publication/283634080_Stress_Detection_Using_Physiological_Sensors?fbclid=Iw
AR14DfDm6-grIsYD1PNUXulnU81S2a74GSQi_H54V43IXyjjBHUHil9PgV8
https://www.ncbi.nlm.nih.gov/pubmed/23790072
https://www.ncbi.nlm.nih.gov/pubmed/29630961
https://www.gla.ac.uk/researchinstitutes/bahcm/staff/ruedinager/ruedinager/publications/headline_386284_en.html
https://www.empatica.com/ 
http://gaugewear.com/#contact
https://vandrico.com/wearables/device/microsoft-band-2

