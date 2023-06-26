# MakeChangeProject_Version2

# Description:

Make Change Version 2 is an improved version of the original Make Change project. This Java program is designed to assist cashiers in cash transactions by breaking down the denominations of the change owed to the customer. The following enhancements have been made in this version:

1. Input Validation:

   - Original Code: No input validation is performed.
   - Refactored Code: The refactored code introduces the `getValidDouble` method, which ensures that the user provides a valid double value for the item price and amount tendered. It utilizes a `Scanner` object and a while loop to repeatedly prompt the user for valid input if an invalid value is entered.

2. String Formatting:

   - Original Code: The original code constructs the message for the remaining amount and change using concatenation.
   - Refactored Code: The refactored code utilizes `String.format` to format the amount values with two decimal places, ensuring a consistent display of the remaining amount and change as "X.XX".

3. Change Breakdown Logic:
   - Original Code: The original code calculates the change breakdown using separate divisions and conditional statements for each denomination.
   - Refactored Code: The refactored code significantly improves the change breakdown logic. It employs two arrays, `values` and `labels`, to store the denominations and their corresponding labels. By iterating over the denominations in a loop, it calculates the quantity of each denomination, subtracts the appropriate amount from the change, and displays the quantity and label of each denomination. This approach eliminates repetitive code and enhances the maintainability and flexibility of the program.

These changes enhance the functionality and usability of the Make Change program by introducing input validation, ensuring consistent formatting, and providing a more efficient and maintainable change breakdown logic.

# Technologies Used:

<p align="left"> <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> </p>
