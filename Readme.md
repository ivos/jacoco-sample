# JaCoCo Sample Project

This is a working example of JaCoCo reporting in a multi-module Maven setup.

There are the following separate Maven modules:

- `core`: source files for which the coverage is measured
- `web`: builds the WAR
- `its`: runs the WAR in Jetty and executes the integration tests
- `report`: generates the JaCoCo HTML report in target/site

Run

    mvn clean install

to generate the coverage report.
