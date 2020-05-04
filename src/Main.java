public class Main {
    public static void main(String[] args) {
        zombie zombie1 = new zombie();
        zombie zombie2 = new zombie();

        zombie1.username ="erick";
        zombie1.coin = 1000;
        zombie1.berlian = 500;
        zombie1.warna = "hijau";
        zombie1.misi = "semua misi selesai..";

        zombie2.username ="doni";
        zombie2.coin = 2000;
        zombie2.berlian = 450;
        zombie2.warna = "merah";
        zombie2.misi = "semua misi selesai..";

        zombie1.makanZombie();
        zombie1.memecahkanMisi();
        zombie1.jadiRobot();

        System.out.println(zombie1.coin);
        zombie1.makanzombie(zombie2);
        System.out.println(zombie1.coin);


    }
}
