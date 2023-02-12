public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog",7);
        System.out.println("Type: "+ animal.getType()+"\n"+"Age: "+ animal.getAge());
        animal.setType("mastiff");
        animal.setAge(8);
        System.out.println("Type: "+ animal.getType()+"\n"+"Age: "+ animal.getAge());
    }
}
