
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


I made use of the tool's coverage report once I had completed the project tasks and noted that the overall coverage for the project was 95% which was satisfactory however, after looking at the coverage for each class I noted as can be seen above the coverage for the student grade class was only 75%.

I then checked to see what methods had not been covered by a test and then created tests for these methods. They had been missed in the test driven development process as they where being called by other methods which were tested but these methods were never tested directly. 

- [New test created to improve Student Grade test coverage](https://github.com/rmacken98/FinalSQACA/pull/12/commits/ca93fbb755ba70eb7feb4263ae1e34fa80aaeb64)

Afterwards the I ran the tests again got the updated coverage report.

![Coverage report after updated](./images/OverallCoverage.jpg "Coverage report.")


As seen above the overall test coverage for the project increase to 97.4% and the Student Grade class coverage increased to 95.5% with all classes now being above 90%.

Using this tool in conjunction with test driven development helped minimize the amount of bugs in the project ensuring that every method was covered by a unit test. 

# Team Version-Control
 For the team version-control of this project I used the Gitflow process branching model when creating new branches during its development.


## Outline of Gitflow model:

- New features in development are built within their own feature branches.
- These branches are branched off of the development branch.
- Once a feature has been completed the feature branch is merged into the development branch.
- Then once the project the ready for release the development branch is merged into release branch.
- The release branch is then merged into the master branch.

## Advantages of Gitflow process:
- Allows for easier collaboration as two or more developers can work on the same feature and since each feature branch is only concerned with getting that feature working. It makes it easier to track the work of the other developers.
- Allows for parallel development of multiple feature. Since features are isolated to their own branch if another task needs to worked that is a bigger priority the developer can simply commit their changes and switch branches and begin working on the other task.
- Aides in staging releases since all completed features are merged into the develop. When creating a release branch it only needs to be branched off of the development branch to contain all the features for ready for the release.

## Branches used in this project
| Branch| Purpose |
| ------------- |:-------------:|
| [main](https://github.com/rmacken98/FinalSQACA)    | Master branch | 
| [dev](https://github.com/rmacken98/FinalSQACA/tree/dev)   | Development branch which each feature branch was branched off of and merged back into |
| [sprint-planning](https://github.com/rmacken98/FinalSQACA/tree/sprint-planning) |Feature branch for documentation containing information of the sprint planning for the project|
| [create-rubric-component](https://github.com/rmacken98/FinalSQACA/tree/create-rubric-component)  | Feature branch for the creation of the rubric component classes with auto generated getters + setters  |
| [add-methods](https://github.com/rmacken98/FinalSQACA/tree/add-methods) | Feature branch for the project's different add methods (e.g. adding a graded criterion to a student grade) |
| [get-methods](https://github.com/rmacken98/FinalSQACA/tree/get-methods)   | Feature branch for the project's different get methods (e.g. getting a list of student grades or list of rubrics) |
| [mean-calculations](https://github.com/rmacken98/FinalSQACA/tree/mean-calculations)  | Feature branch for the mean calculation features of the project (e.g. getting average student grade for a rubric) |
| [min-max-calculations](https://github.com/rmacken98/FinalSQACA/tree/min-max-calculations)   | Feature branch for the getting minimum and maximum calculation features of the project (e.g. getting highest or lowest student grade for a rubric) |
| [standard-deviation-calculations](https://github.com/rmacken98/FinalSQACA/tree/standard-deviation-calculations)   | Feature branch for the standard deviation calculation features of the project (e.g. getting standard deviation of student grades for a rubric) |
| [unit-testing-tdd](https://github.com/rmacken98/FinalSQACA/tree/unit-testing-tdd) |Feature branch for documentation containing information on the unit testing and test driven development process |
| [test-coverage](https://github.com/rmacken98/FinalSQACA/tree/test-coverage) |Feature branch for documentation containing information on the project's test coverage |
| [team-version-control](https://github.com/rmacken98/FinalSQACA/tree/team-version-control) |Feature branch for documentation containing information on the GitFlow process |
| [code-review](https://github.com/rmacken98/FinalSQACA/tree/code-review) |Feature branch for documentation containing information on the project's code review process |
| [fixes-and-enhancements](https://github.com/rmacken98/FinalSQACA/tree/fixes-and-enhancements) |Hot fix branch for any fixes or enhancements that need to made to project that may have been missed in reviews |
| [release-1.0.0]((https://github.com/rmacken98/FinalSQACA/tree/release-1.0.0)) | Release branch for the project's first release |


# Code Reviews 
Code Reviews are the process by which programmers carry out a systematic review of software source code generally reviewing the code of their colleagues. However, since this project was undertaken individually I reviewed my own code and pull requests. 

## Review Process 
For this project I decided that there would be 3 types of pull requests for merging into the development branch which were documentation, new features, and fixes/enhancements with each type having their own checklist. 

The main purpose of the fixes/enhancements pull request is for fixes or enhancements to both the project's documentation and features addressing issues that may have been missed in previous code reviews.

 Since I was reviewing my own work rather than having peers doing so occasionally there were issues I did not notice during reviews. 
 
 To address this issue upon completion of the documentation and features I conducted another review of the project's documentation and features referring to their checklists and making changes when needed.
 
  Then conducting another review of the fixes or enhancements before merging the pull request.

## Code Review Checklists

### Checklist for Documentation
| Question| Answer |
| ------------- |:-------------:|
| Is the description of the topic clear? |Yes|
| Is the pull request correctly labeled?    | Yes  |
| Grammatical errors? | No  |
| Is the content of the topic clear and relevant?    | Yes |
| Is the topic layout well structured?    | Yes|


### Checklist for new feature
| Question| Answer |
| ------------- |:-------------:|
| Is the description of the feature clear? |Yes|
| Is the pull request correctly labeled?    | Yes  |
| Do the tests pass?    | Yes  |
| Does the implementation meet the full requirements of the task?    | Yes  |
| Are the commit messages  clear?  | Yes  |
| Does the code have comments? if so are they clear and meaningful?  | Yes  |
| Does the code follow the set naming rules?  | Yes  |
| Is the code structure well laid out and easy to read?  | Yes  |
| Is there duplication of code that can be removed?  | No |
| Has the backlog been updated?  | Yes  |


### Checklist for fix or enhancement
| Question| Answer |
| ------------- |:-------------:|
| Is the description of the fix/enhancement clear? |Yes|
| Is the pull request correctly labeled?    | Yes  |
| Do the tests pass?    | Yes  |
| Are the commit messages  clear?  | Yes  |
| Does the code have comments? if so are they clear and meaningful?  | Yes  |
| Does the code follow the set naming rules?  | Yes  |
| Does it improve the overall layout of project| N/A |
| Does it fix a bug that previously existed in the project | N/A |
| Does it reduce code duplicate code missed in reviews ? | N/A |


## Pull Request process

### Steps taken when creating a PR:

- When creating a pull request I made sure to label the pull request as one of the 3 types.

- I then wrote a clear description of what was being addressed in the pull request.

![PR Description](./images/description.jpg "PR Description")



- I then assigned the responsibility of the pull request to myself as I would have done in team environment.


<p align="center">
<img src="./images/pullrequestLabel.jpg" alt="Assigning Label and PR type" >
</p>

- I then checked that the pull request was merging into the correct branch before creating the pull request.


- Before merging any pull request I conducted a review using the checklist for the pull request type reviewing the files then marking them as viewed.


![Assigning Label and PR type](./images/viewed.jpg "Assigning Label and PR type")


- I then commented the completed checklist of the pull request.

![Assigning Label and PR type](./images/review.jpg "Assigning Label and PR type")


- Finally I then merged the pull request.

### Sample Pull Requests
| Type |
| ------------- |
| [Documentation](https://github.com/rmacken98/FinalSQACA/pull/15) |
| [New Feature](https://github.com/rmacken98/FinalSQACA/pull/8)  |
| [Fix/Enhancement](https://github.com/rmacken98/FinalSQACA/pull/12)  |




