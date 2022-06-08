package Model;

public class Product {
    private int Id;
    private String Name;
    private int Prize;
    private int Amount;
    private String Describe;

    public Product() {
    }

    public Product(int id, String name, int prize, int amount, String describe) {
        Id = id;
        Name = name;
        Prize = prize;
        Amount = amount;
        Describe = describe;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrize() {
        return Prize;
    }

    public void setPrize(int prize) {
        Prize = prize;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Prize=" + Prize +
                ", Amount=" + Amount +
                ", Describe='" + Describe + '\'' +
                '}';
    }

    public String write(){
        return Id + "," + Name + "," + Prize + "," + Amount + "," + Describe;
    }
}
