public class AnotherClass {
    
    public static void main(String[] args) {
        
        Singleton singleSinstance = Singleton.getInstance();

        Singleton singleSinstance1 = Singleton.getInstance();

        System.out.println(singleSinstance.equals(singleSinstance1));





    }

}
