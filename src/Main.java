public class Main {
    public static void main(String[] args) {
        HotelRoomService<Room> service = new HotelRoomService<>();

        EconomyRoom room1 = new EconomyRoom(101, 2, 50);
        LuxRoom room2 = new LuxRoom(202, 4, 200);

        service.clean(room1);
        service.reserve(room1);

        try {
            service.reserve(room1);
        } catch (RoomAlreadyReservedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        service.free(room1);
        service.reserve(room2);
    }
}
