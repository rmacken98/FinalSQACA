
# Sprint Backlog
## Backlog of Tasks
This is the current backlog of current tasks that need to completed for this sprint.

Tasks will be removed from the backlog as they are completed.

- Get the mean of the score for all students related to specific rubric. 
- Get the standard deviation of the score for all students related to specific rubric. 
- Get the minimum and maximum scores of all the student grades related to a specific rubric.
- Get the mean of the score associated to a specific criterion.
- Get the standard deviation of the score for a specific criterion.
- Get the minimum and maximum scores for scores of a specific criterion. 

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
