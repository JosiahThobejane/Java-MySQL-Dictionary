# Josionary - JAVA, MySQL & JDBC Project.

Josionary is a dictionary software made in Java using the JDBC API and MySQL, it is currently not available as a standalone application, it can however be ran in Netbeans IDE and other IDEs that can open Java Projects.

#### Please note that this is a Developer Release, those not familiar with programming might face problems with setting this up.

![Josionary](https://github.com/JosiahThobejane/Java-MySQL-Dictionary/blob/master/assets/img/josionary.PNG)

# How To Setup Josionary.
- You need to have the JDK 8+ installed.
- Netbeans IDE 8+ installed
- MySQL Server: WAMP or XAMPP can do the trick :) . 

#### Creating A Database:
- Create a new database and name it as you like. 
- Create a table in your database and name it `wordsdata`
- Create two columns in your `wordsdata` table and name them 
	- Word of `VARCHAR(50)` type.
	- WORD_DES of `VARCHAR(250)` type.
- Word is the Word 'name', WORD_DES is the description of a word.
- I advise that you populate your table with at least 1 word and give it a description.

#### Brace yourself, we modifying the Josionary Code: 
- Open the file `Engine.java`
- Replace the `connString` value with your connection string.
- Replace the `cred` value with your database credentials: 
	- e.g `String cred = "user=YourDatabaseAlias&password=YourPassword";`

#### Should you encounter some issues, feel free to contact me or report and Issue and I will get back to you ASAP! ...enjoy :)

# Josionary - JAVA & MySQL Dictionary

##### This Project uses the *JDBC [Java Database Connectivity]* Library
(UPDATE COMING SOON)
    
---
> Author:  [Josiah Thobejane](http://twitter.com/josiahthobejane)  Version: 0.2 
