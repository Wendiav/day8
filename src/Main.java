public class Main {
    public static void Main(String[] args) {
        String sayHello = "Hej och godmorgon";
        System.out.println(sayHello);


        Animal hourse1 = new Animal();
        Animal hourse2 = new Animal(4);
        Animal hourse3 = new Animal(7,"Saul", "häst");
        Animal hourse4 = new Animal("häst");

        System.out.println("Ångrade mig");
    }
}
