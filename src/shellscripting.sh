#!/bin/bash
export JUNIT_HOME=/usr/local/JUNIT
export CLASSPATH=$CLASSPATH:$JUNIT_HOME/junit-4.10.jar:.
pwd
cd src
javac TestJunit.java
javac TestRunner.java
java TestRunner
