public class Methods {
    public static void main(String[] args) {
        hello();
        String name = "T";
        int age = 24;
        System.out.println(sayHello("Hello "+name));

        System.out.println(sayHello("Hello "+name+".You are "+ age+" years old"));

    }

    static void hello(){
        System.out.println("Hello World!");
    }

    static String sayHello(String name){
        return name;
    }

    static String sayHello(String name,int age){
        

        return name+age;
    }

    
}
