public class Client {
    public static void main(String[] args) {

        DataBase dataBase = new Adapter(new JavaApp());

        dataBase.insert();
        dataBase.update();
        dataBase.update();
        dataBase.remove();
    }
}

