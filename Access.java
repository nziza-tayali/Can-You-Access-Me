class Parent {
    protected void protect(){
        System.out.println("Im inside protected method");
    }
}
class child extends Parent{
    private void privateMethod(){
        System.out.println("Im inside private method");
    }
}

public class Access {
    public static void main(String[] args) {
        child kid = new child();
        // kid.privateMethod();

        System.out.println("Hello world!");
    }
}
