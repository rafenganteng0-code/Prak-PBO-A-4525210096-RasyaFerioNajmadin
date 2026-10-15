package inner_class;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RESTAURANT ORDER SYSTEM ===");

        // Perbaikan: Hapus label parameter (restaurantName, address, phone)
        Restaurant pizzaHut = new Restaurant("Pizza Hut", "Jl. Sudirman No.123", "021-555-1234");
        Restaurant KFC = new Restaurant("KFC", "Jl. Thamrin No.456", "021-555-5678");

        pizzaHut.displayRestaurantInfo();
        KFC.displayRestaurantInfo();

        // Perbaikan: Hapus label parameter customerName jika tidak didukung oleh method createOrder
        Restaurant.Order order1 = pizzaHut.createOrder("Rina");
    }
}