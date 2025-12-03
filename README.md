# e-Shopping Cart

### About:

This project builds on the code provided at: https://github.com/shashirajraja/shopping-cart. This implementation adds a brand new product line and allows discounts (of certain types) to be added to products. When updating an existing product, the user can now add a discount from a list of options. They can also add products to the new product line or category. The new category was also added to the drop down menu so the user can navigate to the new products. In the user's cart, they are told of the amount of money they have saved.

Changes to the SQL were also implemented. A discount table was added to the database and is used for handling most or all of these new feeatures.



### SOLID AND DESIGN PATTERNS

This project tries to avoid too much hard-coding of the changes. In the previous project, most information was hard coded. For example, to apply the discount to the products, the ProductBean.java file itself was changed to apply this new element. 

One way of addressing an issue with the previous implementation, I created a brand new tabble (discount) and created the corresponding DiscountService.java and DiscountServiceImpl.java files. Now, despite my changes, I'm not sure all the conditions of SOLID was met. I doubt it. However, trying to think in this way did help me. For instance, I had trouble when trying to focus on this principle and it took a lot of tinkering to get to the point I'm at now. One way of getting over some troubles was trying to keep the Single Responsibility Principle in mind. I think the biggest way I applied this was by moving some of the responsibility of the DiscountService and/or the DiscountServiceImpl files to the SQL file. For instance, the code for the trigger is an easier way of handling the changes to the new table, rather than creating and implementing more methods in the DiscountService and DiscountServiceImpl files.

Another SOLID principle that may have been applied is the Open/Closed principle. For example, for my DiscountService and DiscountServiceImpl files, I was able to extend the behavior and add more methods for when I needed to get information from the classes in some of the .jsp files. 

As for design patterns, I'm aware that we're supposed to implement the discounts using the Strategy pattern. When creating this implementation, I mostly focused on attempting have the software be more SOLID. So I don't think I actually implemented this particular pattern and can't say I know for certain which patterns I did apply, if I applied any.


### Tutorial:

Make sure all relevant technologies are downloaded. Extract any ZIP files as needed.

1. Create a new Workspace in Eclipse EE.
2. Clone this GitHub repository (see step 2 on "Importing and Running The Project Through Eclipse EE" in the original repository to explain how this is done).
3. Follow the steps outlined in the original repository to create the database.
4. Follow the steps outlined in the original repository address the mailing function.
5. Download the "application.properties" file at: https://github.com/shashirajraja/shopping-cart/blob/master/src/application.properties. Insert this file into
the "src" folder of your project. This should avoid the error detailed here by ChatGPT: https://chatgpt.com/c/691d2db4-eaec-8328-ac2f-24fb1b489499.
6. Follow steps 3 through 11 outlined in the original repository (under the header "Importing and Running The Project Through Eclipse EE") as needed.



## Credit:

- Code and design based on that provided by Kevin Do at: https://github.com/DBasss/E-Commerce-Shopping-Cart-Enhancement
- Code and design extends that provided by Shashi Raj at: https://github.com/shashirajraja/shopping-cart
- Used to help in SQL code: https://www.geeksforgeeks.org/mysql/mysql-update-join/
- Used to help in SQL code: https://www.geeksforgeeks.org/mysql/update-one-table-with-another-tables-values-in-mysql/
- Used to help in SQL code: https://stackoverflow.com/questions/56704456/creating-table-with-multiple-check-constraints-on-a-column
- Used to help in SQL code: https://www.tutorialspoint.com/how-can-i-insert-default-value-in-mysql-enum-data-type
- Used to help in SQL code: https://www.google.com/search?q=mysql+update+using+select+w3schools&rlz=1C1ONGR_enUS1088US1088&oq=mysql+update+using+select+w3schools&gs_lcrp=EgZjaHJvbWUyCQgAEEUYORigATIHCAEQIRigAdIBCDk3MzZqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8
- Used to help in SQL code (I just cited the whole tutorial instead of each individual page): https://www.w3schools.com/mysql/default.asp
- Used to help in SQL code: https://stackoverflow.com/questions/456644/mysql-syntax-error-message-operand-should-contain-1-columns
- Used to help in SQL code: https://stackoverflow.com/questions/33101276/using-case-to-update-column-value-depending-on-other-column-values
- Used to help in SQL code: https://dev.mysql.com/doc/refman/5.7/en/enum.html#enum-literals
- Used to help in SQL code: https://stackoverflow.com/questions/14847702/multiple-if-statements-in-mysql-trigger
- Used to help in SQL code: https://community.spiceworks.com/t/mysql-trigger-with-multiple-if-conditions/626315/3
- Used to help in SQL code: https://stackoverflow.com/questions/63690814/mysql-trigger-creation-executes-without-syntax-error-but-no-trigger-created-oth
- Used to help in SQL code: https://stackoverflow.com/questions/14268881/assigning-column-value-in-trigger-causes-unknown-system-variable-error
- Used to help in SQL code: https://stackoverflow.com/questions/14316487/java-getting-a-substring-from-a-string-starting-after-a-particular-character
- Used to help in SQL code: https://dev.mysql.com/doc/refman/8.4/en/begin-end.html
- Used to help in SQL code: https://stackoverflow.com/questions/67889347/mysql-trigger-with-multiple-if-statements
- Used to help in SQL code: https://www.tutorialspoint.com/mysql/mysql-check-constraints.htm
- Used to help in SQL code: https://www.w3resource.com/mysql/mysql-triggers.php
- Used to help in SQL code: https://www.geeksforgeeks.org/mysql/mysql-after-update-trigger/
- Used to help in SQL code: https://stackoverflow.com/questions/36955718/mysql-update-with-select-from-another-table
- This may have been from when I had an error on a query: https://stackoverflow.com/questions/8084571/not-unique-table-alias
- Used to help in SQL code: https://stackoverflow.com/questions/5372872/mysql-trigger-if-condition-exists
- Error in compiling .jsp (didn't really use, though it may have inspired the idea that I used to fix the actual error): https://support.atlassian.com/confluence/kb/unable-to-compile-class-for-jsp/

