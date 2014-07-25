Runes-of-Wizardry
=================

This is a repository where I am slowly developing a magic mod for the game of Minecraft.

This repo has a wiki with a pretty good explanation of what I am trying to accomplish- check it for more detailed info for what the mod does/will do.

Issue Reporting
----------------
If you wish to report an issue with the mod, please submit one to the issue tracker in this repository.  When creating an 
issue, please be sure to include...

-the version of Runes of Wizardry you are using<br />
-the version of Forge you are using<br />
-the crash report (preferrably via <a href="http://pastebin.com/">Pastebin</a>) generated by the error<br />
-depending on the error, an image of the problem<br />

Contributing
-------------
Runes of Wizardry is open-source under the GPL v3 license.  As a result, you may contribute to the development of the mod via pull requests.

If you plan to contribute, it might be helpful to let others know what you are working on by writing an issue (use the "contribution" tag)

To set up the mod as to allow you to make changes, do the following:

1. Keep in mind these setup instructions are for IntelliJ IDEA ONLY, not Eclipse.
2. Clone the repository onto your local system.
3. Open a command prompt from the repository folder.
4. Run the command 'gradlew setupDecompWorkspace'.
5. Then, run 'gradlew idea'.
6. Open IntelliJ and point to either the project folder or the build.gradle file.
7. After opening the project in IntelliJ, run 'gradlew genIntellijRuns' in the command terminal you opened earlier.
8. You now have a functional local copy of Runes of Wizardry, ready to develop on.

Instructions for Netbeans IDE

1. Install the gradle plugin for NetBeans
2. Go to Tools->Settings->Misc->gradle and change "build script evaluation" to "Idea based [...]"
3. follow steps 2-4 above (It might not hurt to run gradlew setupdecompworkspace --refresh-dependencies)
4. open the project folder in NetBeans
5. in project properties, go to "manage built-in tasks"
6. In the "run" task, uncheck inherited and change run to runCLient
7. done!

MAKE SURE TO UPDATE YOUR FORK BEFORE MAKING A PULL REQUEST.
