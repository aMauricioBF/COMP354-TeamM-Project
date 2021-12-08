# COMP354-TeamM-Project

## Simplex Calculator
Simplex Calculator is a console application that allowschildren user to enter mathematical operations in natural languages. The program will then execute the calculation and returns the result to the user, or an error message if applicable. The purpose of the application is to develop children's algorithmic thinking skills.

Users will 

The calculator supports following operations:
* Addition 
* Subtraction 
* Multiplication
* Division
* Reminder


### Documentation
Several documents were created with frame of 4 iterations period during the COMP354 2021 Fall semester.
Documentation to this project is found here: 
* Iteration 1: [Requirements Report](https://docs.google.com/document/d/1J_EjhuQgQG5ay6M5i4XuWWXWaKeKm6dt/edit)
* Iteration 2: [Architecture Design Document](https://docs.google.com/document/d/19__OI2Lq1Xkkx8jRWwL8r6JAh9FYbSHsDRlmYsMisTE/edit)
* Iteration 3: [Quality Control Document](https://docs.google.com/document/d/1TqMxO3YcF1x_5Vtl7T24G6QossgGHgnrlVw7Q91RZSk/edit#)
* Iteration 4: [Final Project Management Plan](https://docs.google.com/document/d/1m4MDFmr31LGZKMyyxelBR6uQ-qmnM3UOFGlORiiU5Oo/edit)


### Instructions
Simply open the Main.java class and run it. A menu will appear and you can navigate using the keyboard (by typing 1, 2, 3, 4).
Our help menu is there to explain how the operations work, but in case it isn't clear enough, here are more instructions: 
* Our ADD, SUBTRACT, MULTIPLY, DIVIDE and REMAINDER operations are pretty self explanatory. To use them you must first type the operator followed by one or two numbers.
  If there are two numbers, it will use them both for the calculation. If there's only one number, the saved result in the memory will be used as the first number.
  E.G. "ADD 2 3" will do 2+3. "ADD 2" will add 2 to our saved value (memory + 2).
* Our IF and LOOP are logical operation that require a condition followed by one basic operator shown above. The condition is limited to a comparison of our memory value with
  a number. The comparison is limited to a "greater or equal (>)" or a "smaller or equal (<)" statement. The IF will check if the condition is true, then do the calculation
  if it is. The LOOP acts as a WHILE loop, repeating the calculation as long as the condition is true (up to 10 iterations). In both cases, if the condition is false, it simply
  returns the current memory value.
  E.G. "IF < 3 ADD 3 4" -> if the memory value is under 3, do 3+4. "LOOP > 0 MULTIPLY 5" -> while the memory value is over 0, multiply the memory value by 5.
* In the calculator menu, type MAIN (or any sentence starting with MAIN) to return to the main menu.

### Dependencies used


### Coding Standards
We have used [Google Java Style Guideline](https://google.github.io/styleguide/javaguide.html) for this project in order to maintain the code clean and neat.


### Organization of this repository
* Souce code: source code of the application available under COMP354-TeamM-Project subfolder.
* Project Scheduling and Estimates: contains project planning schedules that was made with [Team Gantt](https://www.teamgantt.com/) online project task management tool.
Meeting Minutes: Contains all recorded meeting minutes in Microsoft Word format.
code: Contains the Eclipse project with all the Java code and the external GSON library used.
