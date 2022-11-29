package jp.ac.uryukyu.ie.e225758;

public class LivingThing{

    String name;
    int hitPoint;
    int attack;
    boolean dead;

    //nameのgetter
    public String getName(){
        return this.name;
    }
    //hitPointのgetter
    public int getHitPoint(){
        return this.hitPoint;
    }
    //deadのgetter
    public boolean getDead(){
        return this.dead;
    }

    public boolean isDead(){
        return dead;
    }

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 
     * @param maximumHP 
     * @param attack 
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
     
    
    /**
     * HeroまたはEnemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        if (this.dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}
