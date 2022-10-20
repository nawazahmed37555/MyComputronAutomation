# Computron-CEF-Automation

## Tools Used
1. [WinAppDriver](https://github.com/microsoft/WinAppDriver)
2. TestNG
3. Maven (apache-maven-3.6.2)
4. [Allure reporting](https://docs.qameta.io/allure/#_installing_a_commandline)
5. Java SDK 8 (JDK 8.241)
6. [IntelliJ IDE](https://www.jetbrains.com/idea/download/#section=windows) (Install lombok plugin)
7. [Windows 10 SDK](https://developer.microsoft.com/en-us/windows/downloads/windows-10-sdk/) (Developer Mode should be enbaled in Windows Settings for it to work)
 
### Project Structure
 
    |src
        |test
            |java
                |CEF
                    |Base
                        |ConstantBase
                        |LocatorBase
                        |PomBase
                        |TestBase
                    |Data
                        |*Data
                    |POM
                        |*Constant
                        |*Locator
                        |*POM
                    |Test
                        |test*
                    |Utils
                        |LoggerUtil
                        |PackageProperties
 
 
_* = screen name_

### Base

##### ConstantBase

Contains common constants used by all locator classes to fetch elements in CEF application

##### LocatorBase

Contains common locators used through out the application i.e. screen tab buttons

##### PomBase

Contains codes for starting and closing CEF application, logging in and common code used by all descendant POM 
classes i.e. opening General Ledger, Account Payable, etc.

##### TestBase

Contains Before/After Suite, Before/After Test methods being used by all descendant Test classes

### Data
##### ReportDataClass

Contains test data classes for different reports/screens

### POM
##### {ReportName}Constant

Contains the constant String data (i.e. XPaths, names) used with in locators for locating any desktop application
element on specific screen

##### {ReportName}Locators

Contains locators for all required elements of the screen

##### {ReportName}POM

Contains code for interacting with desktop application elements

### Tests
##### test{ReportName}

Contains actual test code for the report/screen

### Utils

Utility classes for logging steps, reading configuration file or any other miscellaneous function 