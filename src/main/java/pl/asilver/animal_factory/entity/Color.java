package pl.asilver.animal_factory.entity;

public enum Color {
    BLACK(10),
    WHITE(15),
    GREY(5),
    BROWN(20),
    GINGER(25),
    MIXED(30);

    private final int popularity;

    Color(int popularity) {
        this.popularity = popularity;
    }

    public int getPopularity() {
        return popularity;
    }
}
