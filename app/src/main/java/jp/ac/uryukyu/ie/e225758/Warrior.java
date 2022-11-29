package jp.ac.uryukyu.ie.e225758;

public class Warrior extends Hero{

    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
            if (this.dead == false){
                int damage = (int)(1.5 * attack);
                System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
                opponent.wounded(damage);
            }
    }
}