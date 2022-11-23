@echo off
echo %cd%
echo %~dp0
set /p id="please enter the Test XML :"
call mvn clean test -Dtestxml=%id%


pause