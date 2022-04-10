public class Singleton {
    
    private static Singleton s; //null

    private Singleton(){

    }

    public static Singleton getInstance(){

        if (s == null){
            System.out.println("null");
            s = new Singleton();
            return s;
        }
        else  if (s != null){
            System.out.println("not null");
            return s;
        }

        return s;
        

    }

}
