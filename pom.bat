@echo off
echo %cd%
echo %~dp0
set /p id="enter maven command and testcase id :"
call mvn clean test -Dtestxml=%id%


pause