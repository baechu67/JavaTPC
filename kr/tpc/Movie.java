package kr.tpc;

public class Movie {
    private String title;
    private int ticketPrice;
    private String mainActor;
    private int level;
    private float time;

    public Movie() {}

    public Movie(String title, int ticketPrice, String mainActor, int level, float time) {
        this.title = title;
        this.ticketPrice = ticketPrice;
        this.mainActor = mainActor;
        this.level = level;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", mainActor='" + mainActor + '\'' +
                ", level=" + level +
                ", time=" + time +
                '}';
    }
}
