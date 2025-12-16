==== HOW TO CREATE .JAR ARCHIVE ====

1) Compilate your project
   i use : javac -cp "lib/*" -d out $(find src -name "*.java")
2) Create a MANIFEST :
   echo "Main-Class: lab2.Programm" > MANIFEST.mf
   echo "Class-Path: lib/Pokemon.jar" >> MANIFEST.mf
3) Create a .jar archive :
   jar cfm Lab2.jar MANIFEST.mf -C out .
4) Start u .jar archive :
   java -jar Lab2.jar


   NOTIES:
The package names may differ from mine. All you need to do to create the archive is use these commands with YOUR package names.

Note that you must first place the .jar archive in the lib folder; without it, nothing will work.

Also, pay attention to the names. In my case, Pokemon.jar is capitalized.
