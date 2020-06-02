/* 
   Zachary Hanna
   February 22, 2016
   Description:
              In this program, a class named “Employee” is created. The class contains 3 instance private variables that store
              the employee’s name, ID number, and hire date. A Java constructor is activated when an object is
              created; the constructor creates the values for the object. The constructor will initialize the name, ID number, 
              and hire date of the employee. Everything that is initialized has its own setter and getter.
   
*/

public class Employee
{
   private String name;             // Name of employee inside of a private string
   private String employeeNumber;   // Number of employee inside of a private string
   private String hireDate;         // Hire Date of employee inside of a private string
   
   
   public Employee(String nameOfEmployee, String numberOfEmployee, String dateOfEmployee)
   {
      name = nameOfEmployee;  // string initialization for name 
      setEmployeeNumber(numberOfEmployee); // numberOfEmployee goes into employeeNumber with a funtion
      hireDate = dateOfEmployee; // string initialization for hireDate
   }

      
   public Employee()
   {
      name = "";  // empty string initialization for name 
      employeeNumber = "";  // empty string initialization for employeeNumber
      hireDate = "";  // empty string initialization for hireDate
   }
   

   public void setnameOfEmployee(String nameOfEmployee)
   {
      name = nameOfEmployee;  // nameOfEmployee argument initilized with name
   }


   public void setEmployeeNumber(String numberOfEmployee)
   {
      if (isValidEmpNum(numberOfEmployee))
         employeeNumber = numberOfEmployee;  // numberOfEmployee argument initilized with employeeNumber
      else
         employeeNumber = "";  // empty string initialization for employeeNumber
   }


   public void setHireDate(String dateOfEmployee)
   {
      hireDate = dateOfEmployee;  // dateOfEmployee argument initilized with hireDate
   }


   public String getNameOfEmployee()
   {
      return name;  // name of employee is returned
   }


   public String getEmployeeNumber()
   {
      return employeeNumber;  // number of employee is returned
   }
   
   public String getHireDate()
   {
      return hireDate;  // hire date of employee is returned
   }

   // method to check if employee number is valid
   private boolean isValidEmpNum(String checkEmployeeNumber)
   {
      boolean status = true;
      
      if (checkEmployeeNumber.length() != 5)
         status = false;
      else
      {
         if ((!Character.isDigit(checkEmployeeNumber.charAt(0))) ||
             (!Character.isDigit(checkEmployeeNumber.charAt(1))) ||
             (!Character.isDigit(checkEmployeeNumber.charAt(2))) ||
             (checkEmployeeNumber.charAt(3) != '-')              ||
             (!Character.isLetter(checkEmployeeNumber.charAt(4))))
               status = false;
      }
      
      return status;
   }

   
   public String toString() // method that puts all strings into one
   {
      String completeString = "Name: " + name + "\nEmployee Number: "; // creates a string called completeString
      
      if (employeeNumber == "")
         completeString += "INVALID EMPLOYEE NUMBER"; // invalid if it is an empty string
      else
         completeString += employeeNumber; // employee number is added to string
         
      completeString += ("\nHire Date: " + hireDate); // hire date is added to string
      return completeString; // returns the completed string
   }
}
