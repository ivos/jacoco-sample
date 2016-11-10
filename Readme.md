# JaCoCo Sample Project

This is a working example of JaCoCo reporting in a multi-module Maven setup.

There are 3 separate Maven modules:

- `core`: source files for which the coverage is measured
- `web`: builds the WAR
- `its`: runs the WAR in Jetty, executes the integration tests and reports the coverage
