/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package limbusbossmaker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ryan
 */
public class Boss {
    String name;
    int level;
    int speedSlots;
    float maxHealth;
    
    //Maps each sin and boss' affinity to it.
    Map<Integer, Integer> sinAffinities;
    List<BossSkill> skills;
    List<Passives> passives;
    
    public Boss(String name,
            float maxHealth,
            Map<Integer, Integer> sinAffinities,
            List<BossSkill> skills,
            List<Passives> passives){
        this.name = name;
    }
    
}
