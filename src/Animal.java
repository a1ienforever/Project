public class Animal {
    private String type;
    private int age;

    Animal(String type, int age){
        this.age = age;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void getVoice(){
        System.out.println("voice...");
    }
}
