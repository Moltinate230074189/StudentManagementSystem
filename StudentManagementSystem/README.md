# Student Management System (ADP372S Mini Assignment)

#Overview
This project is a Student Management System developed in Java using:
-Builder design pattern
-Inheritance and polymorphism
-SOLID Principles

The system supports different student types:
-Undergraduate Students
-Graduate Students

# Features
-Builder pattern used for object creation
-Tuition calculation for each student type
-Clean and extensible design

#SOLID Principles Applied
1. Single Responsibility Principle (SRP)
Each class has one responsibility
-Student defines shared attributes and behaviors
-UndergraduateStudent handles undergraduate specific logic
-GraduateStudent handles graduate specific logic
-Builder classes handle object construction only

2. Open/Closed Principle(OCP)
The system is open for extension but closed for modification
New student types can be added by extending the Student class without changing existing code
Example:
java
public class PartTimeStudent extends Student {...}
