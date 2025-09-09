# SchoolGradingSystem
This is a java project where you are able to input the name and unique id of a student including their given grade and then it would print out the names based on the grading. This project is a practice project to sharpen my skills, I struggle to understand the concept of enhanced for loops and creating a list of objects of a custom class so this project is helping me understand those concepts.

## Terminal Commands
1. To be able to run the program you must make sure you open the directory of the SchoolGradeSystem folder

```
cd "SchoolGradeSystem"
```
2. After that you would want to go to the source code:
```
cd src
```
3. Once then run the main class.
```
Java -cp src main.java
```




## Instructions

1. Start by running the main class in your IDE of choice or running it from the terminal using the commands above.
2. Once the main class is up and running a menu should appear looking like this: 
```
:::Welcome to Grade Ranker:::
Type “Enter” to enter a student into the system
Type “Display” to display the ranking
Type “Get Student” to get a students information
Type “Exit” to end the season
```
3. The arraylist would be empty so the first thing you would want to do is add students to the system so you should type Enter. Its not case sensative so it does not matter how you type it.
```
enter
```
4. Once you type enter then you will be prompted to enter the students first and last name along with their unique ID and given grade. (Below is an example)
```
Enter the students first name: 
John  
John
Enter the students last name: 
Doe
Doe
Enter the students ID name: 
1234
1234
Enter the students grade: 
A+
A+
Student Added
```
5. You will now be returned to the menu. To display and rank the students type "display" and it will print out all the students from highest to lowest grades.
```
display
```
```
John Doe 1234 A+
Han Solo Skywalker 1567 B
Joe Bloggs 1245 C
Darth Vader 1098 C
```

6. You will now be returned to the menu. To get a students information type "get student".
```
get student
```
you will be then asked to type the students unique ID. Type the unique ID and it will display the students information.

```
Enter Students unique ID
1234
John Doe 1234 A+
```
7. To exit the program type "exit" in the menu the following should appear: 
```
exit
::Exiting Grade Ranker::
```
