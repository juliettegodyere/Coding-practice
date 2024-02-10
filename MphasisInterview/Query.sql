-- write a query to find all employees in the employee table that their salary is greater than or equal 
-- the employee called Rita.
-- You have a table of employees with id, name, email address, salary etc. Write a SQL query to print names of all the employees whose salary greater than or equal to the employee with first name "Rita".

SELECT *
FROM employee
WHERE salary >= (
    SELECT salary
    FROM employee
    WHERE name = 'Rita'
);

