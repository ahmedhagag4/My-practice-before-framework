module MyModule {

    //now any one requires MyModule can access those packages
    exports JavaBase;
    exports LimiteTheAccess;
    exports NewAccessibilityWithModules;



    //now i can use the exported packages on those modules
    requires java.base;
    requires java.compiler;
}

//module has two important improvement for java

// 1- first accessibility
//Before JDk-9 all package was in one JAR file and that makes you in only two Situation
//1- you only make the class or the method access for its own package
//2- you make the class or the method access for all packages

//and here came modules to solve this problem

//with modules, you can choices the packages how can be shared with other packages
//by using exports (so you (this package can be accessibility for who requires this module))

//requires => you say you want to add the exported packages on this module to you project

//=============================================================================================================================

//2- we can make smaller applications

//if we only used some modules and not all of them
//we can by the help of jlink reduce the size of the JRE


//=============================================================================================================================

//3- when i have for example 3 packages and every one of has the same jar but
//if i changed the content of the jar in one of the 3 package the other 2 will
// not change and i need to change them manually


//to solve this problem you can add the packages of jar in a module
//and require this new module to my project that had 3 packages
//now if want to change something i will only change it in the new module
//and by default it well change in all my packages because they require the module













