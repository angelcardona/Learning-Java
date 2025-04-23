class User{
    double id = Math.round(Math.random());
    String name;

    User(String name){
        this.name=name;

    }
    public void greet(){
        System.out.println("Hello World i'm "  + this.name);
        System.out.println("my id is "+this.id);
    }
}