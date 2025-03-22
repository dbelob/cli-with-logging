# Command line interface (CLI) with logging in Java

The example demonstrates how to create command line application with logging in *Java 8+*.

## Requirements

* [JDK 8+](https://www.oracle.com/java/technologies/downloads/)
* [Apache Maven 3.9.0+](https://maven.apache.org/download.cgi)

## Compilation

1. Install [Java SE 8](https://www.oracle.com/java/technologies/downloads/) or higher (*JDK*)

1. Install [Apache Maven 3.9.0](https://maven.apache.org/download.cgi) or higher

1. From the command line with *Maven* (in the root directory):

   `mvn clean package` or `mvn clean install` 

## Running (after compilation)

1. Change directory:

   `cd cli-with-logging-distrib/target`

1. Find distribution file:

   `cli-with-logging-<version>.zip`

1. Extract files from ZIP, for example:

   `unzip cli-with-logging-<version>.zip`

1. Change directory:

   `cd cli-with-logging-<version>`

1. Run:

   `runme.bat` (*Windows*)  

1. See log files in `logs` subdirectory
