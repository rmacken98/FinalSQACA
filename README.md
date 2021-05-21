
# Sprint Backlog
## Backlog of Tasks
This is the current backlog of current tasks that need to completed for this sprint.

- Backlog is currently empty all tasks completed.
- Completed tasks with their estimations are listed below.


# Task Estimation
The approach I decided to use for the estimates for each task in the sprint backlog.
Is the T-Shirt planning technique this approach uses the sizes of t-shirts to estimate
the amount of time required to implement each task in the backlog.

Due to the overall complexity and number of tasks in the backlog I decided to use the sizes of Small, Medium and Large.
Before assigning an estimate to a task I had to consider the following factors:

- How complex is the task?
- Will it require research?
- Does it require a unit test?

I then decided the criteria for each task:

### Small:
 - The task is relatively simple and self explanatory for example only requiring the creation of a class with getters and setters.
 - It does not require research.
 - It may not require a unit test.

### Medium: 
 - The task is either non-complex but requires more than just creating objects or classes or it is moderately complex
   and with unknown aspects that need to be figured out.
 - It may require research.
 - Requires unit test/s.

### Large
 - The task is complex with unknown aspects to the class that need to be figured out.
 - It requires research.
 - Requires unit tests.

## Task Estimates
- Decided on what test coverage tool to use. (M)
- Create Rubric (S)
- Create Criteria (S)
- Add Criteria to a Rubric (S)
- Create Student Grades (S)
- Add a criteria score to a student grade (S)
- Get a list of all Rubrics (S)
- Get a specific Rubric by name (M)
- Get a list of all Student Grades associated with a rubric (M)
- Get the mean of the score for all students related to specific rubric. (M)
- Get the standard deviation of the score for all students related to specific rubric. (L)
- Get the minimum and maximum scores of all the student grades related to a specific rubric. (L)
- Get the mean of the score associated to a specific criterion. (M)
- Get the standard deviation of the score for a specific criterion. (L)
- Get the minimum and maximum scores for scores of a specific criterion. (L)

## Estimate Comparison 
To show the process of how I decided to assign a sizing to an estimate. 
I will compare the tasks of creating a Rubric and getting the standard deviation of student grades related to a rubric. 
Seeing how they meet the requirements I set for their sizing and do not meet the requirements for the sizing of the other task.

Creating a Rubric meets the requirement of a small task and does not meet the requirements for a large task as it:
- It is not complex and is self explanatory. It will only require the creation of a rubric class with a constructor + getters and setters.
- Does not require research.
- Does not require a unit test.

Getting the standard Deviation of all student grades related to a rubric is large task as it:
- In comparison to the creation of a rubric it is a complex task.

  As it will require being able to get the values from each of the student grades related to a rubric and performing a calculation with those values.
- I will have to research on how to calculate the standard deviation.
- It will require unit tests to ensure the feature works correctly.

# Velocity 
The sprint Velocity metric determines average number of story points that a team can achieve within a sprint.

This project has been undertaken under one sprint.

In order to calculate the velocity for this project I assigned time values to each task size.

- Small = any task that will take under 1 hours.  
- Medium = any task that will take 2 hours.  
- Large = any that will take 4 hours.  

Then multiply the number of tasks related to a size by the time value that has been assigned.

Here we have 6 Small, 5 Medium, and 4 Large so the time required to complete this sprint will be :

(6x1)+(5x2)x(4x4) = 29 hours

Then to calculate the velocity metric we divide the number of points completed at the end of each sprint by number of sprints.
In this instance the velocity will be 29 as there is only one sprint. 

# Test Driven Development + Unit Testing

Test driven development(TDD) is a software development approach where before implementing a piece of functionality for a project the following steps are taken: 
 - A test case is created that will specify and check what the result of the functionality should be. 
 - The test should be failing initially.
 - Then the code to implement the desired functionality is written to get the test to pass.
 - Then if needed the code is refactored and the test is run again to see if it still passes.
    - Note: some refactoring may require the test to be updated before it can take place.
 - Once the test passes and the functionality is implemented move on to the next task and repeat the process.

The benefit of using this approach is that it helps ensure that the code base is free from bugs.

This approach was used in the development of this project. 

Before committing any code I would first write a failing the test and then implement the feature and once each step had been completed I pushed the feature along with its test. 

Below are examples of different commits first showing a feature and its associated test and second showing a test being updated for the refactoring of the feature and third another instance where a new test was created before refactoring.


## Max Grade Feature

- [Max Grade feature with its test](https://github.com/rmacken98/FinalSQACA/commit/82dfeb0fa3986a9cf1c150bc8b6eb9ca76bfecba).


## Refactored Max Grade Feature 

- [Updated test for refactored Max Grade](https://github.com/rmacken98/FinalSQACA/commit/877a36bf8d290c84c3899cd280a8e86a1780ffbc)

- [Refactored Method for Max Grade](https://github.com/rmacken98/FinalSQACA/commit/1dc2c4b48faced82cdf81748d08ab600a72d1407)

## Refactored Controller methods using duplicate loops

- [Test for adding grades loop method](https://github.com/rmacken98/FinalSQACA/commit/f585ee721208572e8961fdcf1b518907eecc995d)

- [Add grades loop method implementation](https://github.com/rmacken98/FinalSQACA/commit/3dd2c383faf7f62a6dfde0b6e84e64cb3901cd93)

# Test Coverage Metric

Before starting this project I had to decide on what test coverage metric tool to use so that I could measure how much of the project's functionality would be covered by the unit tests written for each feature.

Initially I had planned to use the Java Test Runner extension for vsCode as this is my preferred code editor.

However, this extension's test report only provided a list of the number of tests that had passed or failed and where they had failed but did not provide any overall coverage metric. 

Upon further research I decided to use EclEmma which is a java test coverage tool built into the Eclipse IDE. I decided to use this tool as I have a lot of previous experience using Eclipse and EclEmma provides the same features as the Java Test Runner extension for vsCode.
However, EclEmma also has an overall coverage report for a project along with a test report. Showing the percentage of the functionality that has been covered by JUnit tests for the project overall and for each class in the project. 

![Initial coverage report upon project completion](./images/initialCoverage.jpg "Coverage report.")



