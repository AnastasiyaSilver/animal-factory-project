package pl.asilver.animal_factory.entity;

public class Factory {
    private static Factory instance;

    private Factory(){
    }

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }
}
