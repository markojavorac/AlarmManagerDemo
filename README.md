# Alarm Manager Tutorial
### By: Marko Javorac
### For: CENG-319

# Intro
The AlarmManager class allows deveopers to schedule tasks if the application needs to run at a specific time. The time window even includes times when the application is not even running. This allows for some unique functionality that can be implemented across a variety applications

# History
The AlarmManager class has been in the API for since **Level 1** and has always been a core functionality. The AlarmManager is included in the java.lang.Object library resolidiying its importance in the android API.

# Major methods/attributes
The core fuctionality centers around one method called **onReceive()** and can be trigged under multiple conditions/parametrs.

# Getting Going
By doding this tutotrial I will be a assuming a few things.
- Know basic java and Android Studio
- Understand how to use GitHub

# Setting up layout and buttons
To set an alarm, we will need to input a specific time for the alarm to go off and a button to set it.

We will use a TimePicker for the the time input and a Button to activate. Our layout will look like this
![setupMain](https://github.com/markojavorac/AlarmManagerDemo/blob/master/resources/Screenshot_1544225781.png)

# Java code
We will create two different classes in our example. One will be the main page(MainActivity.java) while the actual alarm action will be seperate class called Alarm.java. MainActivity will be setting the alarm and layout while the Alarm.java will contain code to be executed once the alarm is activated. I have put comments all throughout my code to help you understand what is going on.

In MainActivity, prepare the code by creating the main and the imports
![setupMain](https://github.com/markojavorac/AlarmManagerDemo/blob/master/resources/main_setup.PNG)

Pull the time from the TimePicker and generate a calaender object
Note: API 23 Introuduced some changes to the calander that must be taken into account. This is why there is an if statment
![setCal](https://github.com/markojavorac/AlarmManagerDemo/blob/master/resources/main_setup2.PNG)

Set the alarm using the passed time and generate a toast that notifys the user.
![setAlarm](https://github.com/markojavorac/AlarmManagerDemo/blob/master/resources/main_alarm_set.PNG)

In Alarm, prepare the code by adding main and the imports.
Note: The Alarm class extends BroadcastReciever. This is how the AlarmManager widget functions 
Then decide what to do when the alarm is activated. For simplicity, I just send a toast.
![alarm class](https://github.com/markojavorac/AlarmManagerDemo/blob/master/resources/alarm.PNG)


# Example Project
This repository contains all the source code and associated files nneded to create this application
The following exmaple project will guide you through setting up your first AlarmManager functionality in a basic application.

# Code

# Reference
https://developer.android.com/reference/android/app/AlarmManager

