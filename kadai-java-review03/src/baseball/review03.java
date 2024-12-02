package baseball;

public class review03 {

    public static void main(String[] args) {
        BaseBallTeam team1 = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        BaseBallTeam team2 = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam team3 = new BaseBallTeam("阪神タイガース",68,71,4);
        BaseBallTeam team4 = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        BaseBallTeam team5 = new BaseBallTeam("広島東洋カープ",66,74,3);
        BaseBallTeam team6 = new BaseBallTeam("中日ドラゴンズ",66,75,2);

        team1.report();
        team2.report();
        team3.report();
        team4.report();
        team5.report();
        team6.report();
    }

}
