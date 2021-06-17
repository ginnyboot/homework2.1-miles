public class Main {
    public static void main(String[] args) {
        int ticketpriceInKopecks = 6500_00;
        int milefactorInKopecks = 20_00;
        int totalmiles = ticketpriceInKopecks / milefactorInKopecks;
        System.out.println("Начислено миль — " + totalmiles);
    }
}
