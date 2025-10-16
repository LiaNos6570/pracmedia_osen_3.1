public class HotelRoomService<T extends Room> implements RoomService<T> {

    public void clean(T room) {
        System.out.println("Комната " + room.number + " убрана");
    }

    public void reserve(T room) {
        if (room.isReserved) {
            throw new RoomAlreadyReservedException("Комната " + room.number + " уже забронирована!");
        }
        room.isReserved = true;
        System.out.println("Комната " + room.number + " забронирована");
    }

    public void free(T room) {
        room.isReserved = false;
        System.out.println("Комната " + room.number + " освобождена");
    }
}
