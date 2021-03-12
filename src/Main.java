public class Main {
    public static void main(String[] args) {
        MilesService service = new MilesService();
        int miles = service.calculete(true, 9_800);

        System.out.println("Оплата билета подтверждена. Вам начислены мили: " + miles);

    }
}
