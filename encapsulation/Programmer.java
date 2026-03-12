package encapsulation;

public class Programmer {
    private String name;
    // Getter method used to get the data
    public String getName() { return name; }
    // Setter method is used to set or modify the data
    public void setName(String name) { this.name = name;}
    public static void main(String[] args){
        Programmer pro = new Programmer();
        pro.setName("Muruga");
        System.out.println(pro.getName());
    }
}

