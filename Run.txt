set projectLocation=D:\Users\Hanmant\eclipse-workspace\framework_
cd %projectLocation%
set classpath=%project%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml