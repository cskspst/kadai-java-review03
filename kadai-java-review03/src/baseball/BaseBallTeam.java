package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    public BaseBallTeam() {
        // デフォルトコンストラクタ
    }

    public BaseBallTeam(String name, int win, int lose, int draw) {
        // 引数ありコンストラクタ
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public double getRate() {
        // 勝率をdouble型で返す
        // win, loseは同じクラス内なのでgetterを使わず参照可能
        return ( (double)win / ((double)win + (double)lose) );
    }

    public void report() {
        // レポートを表示する
        System.out.println(name + "の2022年の成績は " + win + "勝" + lose + "敗" + draw + "分、勝率は" + getRate() + "です。");
    }
}
