@echo off
set "JAVA_HOME=%JAVA_HOME%"
set "APP_JAR=lib\bank-0.0.1.jar"
set "MAIN_CLASS=com.app.bank.LoginRegisterApplication.java"

"%JAVA_HOME%\bin\java" -jar "%APP_JAR%" %MAIN_CLASS% > startLogs.txt

