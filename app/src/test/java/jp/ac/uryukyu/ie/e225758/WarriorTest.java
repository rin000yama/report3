package jp.ac.uryukyu.ie.e225758;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
class WarriorTest {
 
    @Test void attackWithWeaponSkillTest() {
            int enemyHp = 1000;
            int attack = 100;
            Warrior demoWarrior = new Warrior("デモ戦士", 1, attack);
            Enemy slime = new Enemy("スライムもどき", enemyHp, 1);
            for(int count = 0; count < 3; count++){
                enemyHp = slime.hitPoint;
                demoWarrior.attackWithWeponSkill(slime);
                assertEquals(enemyHp - attack*1.5, slime.hitPoint);
            }
    }
}