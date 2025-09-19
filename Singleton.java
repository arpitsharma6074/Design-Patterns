package Design-Patterns;

Public class Singleton{
    private static Singleton singleton = null;

    private Singleton(){
       
    }

    public static Singleton of(){
        if(singleton == null) {
            singleton = new Singleton();
            return singleton;
        }else {
            return singleton;
        }
    }
    // The problem with above of method is, if two object access the method
    // at the same time then there might be possible that two different object
    // will get created.


    // To overcome the problem we can use synchronized version of the same method
    public static synchronized Singleton of2(){
        if(singleton == null) {
            singleton = new Singleton();
            return singleton;
        }else {
            return singleton;
        }
    }
}
