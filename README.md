# Wildlife Tracker

This is a java website app that allows user to create rangers , animals, locations and sightings.

## Screeshot
![Portfolio](/images/wildlife.png?raw=true "Optional Title")

## Description

This project covers the postgres database, class abstracts and deployment on heroku.You can create ranger,animals,location and sightings furthermore you can create them.


## Specifications


## Prerequisites

- Basic Git knowledge, including an installed version of Git.
- Your application must run on the OpenJDK version 6, 7 or 8.

## Technologies Used

- Java 
- Gradle
- Spark Framework
- CSS (Bootstrap)
- JUnit
- Handlebars Template Engine
- Heroku
- psql

## Setup Requirements for database
- In PSQL:
- CREATE DATABASE wildlife_tracker;
- \c wildlife_tracker
- CREATE TABLE animals (id serial PRIMARY KEY, name varchar,type VARCHAR,health VARCHAR,age VARCHAR);
- CREATE TABLE locations (id serial PRIMARY KEY,name VARCHAR);
- CREATE TABLE locations_sightings (id serial PRIMARY KEY,location_id INT,sighting_id INT);
- CREATE TABLE rangers (id serial PRIMARY KEY,name VARCHAR,badge_number VARCHAR);
- CREATE TABLE rangers_sightings (id serial PRIMARY KEY,ranger_id INT,sighting_id INT);
- CREATE TABLE sightings (id serial PRIMARY KEY,animal_id INT,ranger_id INT,location_id INT,time TIMESTAMP);
- CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
- Go to DB.class in main/java folder and make necessary changes
-  Go to DatabaseRule in test/java folder and make necessary changes

## Setup Installations Requirements
* To run the application, in your terminal:

    1. Clone or download the Repository
    2. cd into directory then run `cd wildlife-tracker`
    3. Rebuild the Project Using Intellij IDEA or ...
    4. Open terminal command line then navigate to the root folder of the application.
    5. Run `gradle run` command.
    6. Navigate to `http://localhost:4567/` in your browser.


### Development

Want to contribute? Great!

To fix a bug or enhance an existing module, follow these steps:

- Fork the repo
- Create a new branch (`git checkout -b improve-feature`)
- Make the appropriate changes in the files
- Add changes to reflect the changes made
- Commit your changes (`git commit -am 'Improve feature'`)
- Push to the branch (`git push origin improve-feature`)
- Create a Pull Request

## Known Bugs

If you find a bug (the website couldn't handle the query and / or gave undesired results), kindly open an issue [here](https://github.com/AdamuWanganya/wildlife-tracker/issues/new) by including your search query and the expected result.

If you'd like to request a new function, feel free to do so by opening an issue [here](https://github.com/AdamuWanganya/wildlife-tracker/issues/new). Please include sample queries and their corresponding results.

### License

*MIT*
Copyright (c) 2022 **Adamu Wanganya**

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.