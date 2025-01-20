# School Management System

A simple Java project to practice **inheritance** and **polymorphism** by modeling a school management system.

## Objective

- Implement a class hierarchy to represent different types of people in a school.
- Use inheritance, method overriding, and polymorphism in Java.

## Class Structure

1. **`Person`** (Base Class)
    - Attributes: `name`, `age`, `address`
    - Method: `displayInformation()`

2. **`Employee`** (Inherits from `Person`)
    - Attributes: `jobTitle`, `salary`
    - Method: Overrides `displayInformation()`

3. **`Teacher`** (Inherits from `Employee`)
    - Attribute: `subject`
    - Method: Overrides `displayInformation()`

4. **`Student`** (Inherits from `Person`)
    - Attributes: `enrollmentNumber`, `course`
    - Method: Overrides `displayInformation()`

## Instructions

1. Create a `main` class (`School`) to:
    - Instantiate objects for `Student`, `Employee`, and `Teacher`.
    - Call the `displayInformation()` method for each object.

2. (Optional) Store objects in a list and use polymorphism to iterate through and display details.

## Example Output

```text
Name: John Doe  
Age: 25  
Address: 123 Main St  
Job Title: Administrator  
Salary: $40,000  
