@echo off

if "%JAVA_HOME%" == "" goto jremanual
set JRE=%JAVA_HOME%
goto start

:jremanual
set /p JRE=Java folder can't be found. Please, enter your JRE folder:

:start
echo Application JRE: %JRE%

"%JRE%\bin\java" -jar ${project.build.finalName}.jar ${app.mainClass}

if %ERRORLEVEL% equ 0 (
   echo Success, return code: %ERRORLEVEL%
)

if %ERRORLEVEL% neq 0 (
   echo Error, return code: %ERRORLEVEL%
)
