public abstract class Room {
    int number;
    int maxPeople;
    int pricePerNight;
    boolean isReserved;

    public Room(int number, int maxPeople, int pricePerNight) {
        this.number = number;
        this.maxPeople = maxPeople;
        this.pricePerNight = pricePerNight;
        this.isReserved = false;
    }
}
