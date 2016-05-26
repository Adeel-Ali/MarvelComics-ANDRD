MarvelComicsLib
=================
This API SDK was automatically generated by APIMATIC v2.0

How To Configure:
=================
The generated code reads configuration values from the AndroidManifest.xml file and 
therefore, the configuration must be initialized e.g., as following:

com.marvel.gateway.Configuration.initialize(appContext);

Here, the context is from the module that contains the configuration AndroidManifest.xml
The manifest files must contain the following configuration parameters.

	referer		

How To Build: 
=============
The generated code uses a java library namely UniRest. The reference to this
library is already added as a maven dependency in the generated gradle build
file. Therefore, you will need internet access to resolve this dependency.

For build process do the following:

    1. Open Android Studio and use "Import Project" option. 
    2. Provide path to the unzipped archive for the generated code.
    3. Press Ctrl+F9 or use "Make Project" menu command to build.

How To Use:
===========
The build process generates android libaray, which can be used just like an
ordinary AAR library. See the following link for more information on this
topic.

http://tools.android.com/tech-docs/new-build-system/user-guide#TOC-Referencing-a-Library