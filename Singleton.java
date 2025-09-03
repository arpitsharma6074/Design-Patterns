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
}