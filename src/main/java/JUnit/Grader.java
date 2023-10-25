package JUnit;

/*
-----Tutorial-----
-Link: https://www.youtube.com/watch?v=vZm0lHciFsQ
-Title: Java Unit Testing with JUnit - Tutorial - How to Create And Use Unit Tests
-Author: Coding with John

-----Notes-----
-Need to add IntelliJ's Maven framework support for regular Java project
-CTRL + T on method will create Test class in IntelliJ's "test" folder
*/

public class Grader {

    public char determineLetterGrade (int numberGrade) {
        if (numberGrade < 0) {
            throw new IllegalArgumentException("Number grade cannot be less than 0");
        } else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';
        } else if (numberGrade < 80) {
            return 'C';
        } else if (numberGrade < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
