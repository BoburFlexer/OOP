public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.platform = "Android";
        phone.model = "Redmi 4A";
        phone.memory = 32;
        phone.color = "Black";
        phone.condition = "Bad";
        Phone phone1 = new Phone();
        phone1.platform = "IOS";
        phone1.model = "Iphone 13 mini";
        phone1.memory = 256;
        phone1.color = "White";
        phone1.condition = "Good";
        Phone phone2 = new Phone();
        phone2.platform = "Android";
        phone2.model = "Redmi note 8";
        phone2.memory = 128;
        phone2.color = "Black";
        phone2.condition = "Medium";
        System.out.println("Platform:" + phone.platform + ";" + " " + "Model:" + phone.model + ";" + " " + "Memory:"
                + phone.memory + ";" + " " + "Color:" + phone.color + ";" + " " + "Состояние:" + phone.condition + ".");
        System.out.println("Platform:" + phone1.platform + ";" + " " + "Model:" + phone1.model + ";" + " " + "Memory:"
                + phone1.memory + ";" + " " + "Color:" + phone1.color + ";" + " " + "Состояние:" + phone1.condition + ".");
        System.out.println("Platform:" + phone2.platform + ";" + " " + "Model:" + phone2.model + ";" + " " + "Memory:"
                + phone2.memory + ";" + " " + "Color:" + phone2.color + ";" + " " + "Состояние:" + phone2.condition + ".");
    }
}