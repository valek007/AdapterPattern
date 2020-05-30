public class Adapter extends JavaApp implements DataBase{

    JavaApp app;

    public Adapter(JavaApp app) {
        this.app = app;
    }

    @Override
    public void insert() {
        app.saveObject();
    }

    @Override
    public void update() {
        app.updateObject();
    }

    @Override
    public void select() {
        app.loadObject();
    }

    @Override
    public void remove() {
        app.removeObject();
    }
}
