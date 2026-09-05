/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package limbusbossmaker.bosses;

import java.util.List;
import limbusbossmaker.BossSkill;
import limbusbossmaker.Types;

/**
 *
 * @author Ryan
 */
public class BossExample {
    
    List<String> punchingCoinDescriptions = 
            List.of(
            "[On Hit] Deal 3 Blunt bonus damage",
            "[On Hit] Deal 3 Blunt bonus damage",
            "[On Hit] Inflict 3 Paralyze"
            );
    
    List<String> kickingCoinDescriptions = 
            List.of(
            "[On Hit] Deal 3 Blunt bonus damage",
            "[On Hit] Deal 3 Blunt bonus damage",
            "[On Hit] Inflict 3 Paralyze"
            );
    
    List<String> paybackCounterDescriptions =
            List.of(
                    "",
                    "[On Hit] Target loses 5 SP"
            );
    
    BossSkill punchingSkill = new BossSkill(
            "Punching", Types.skill.OFFENSIVE, "",
            Types.sin.ENVY, Types.attack.BLUNT,
            Types.coin.REGULAR, 1, 3, 3, 2,
            Types.skillFrame.NORMAL, punchingCoinDescriptions,
            ""
    );
    
    BossSkill kickingSkill = new BossSkill(
            "Kicking", Types.skill.OFFENSIVE, "",
            Types.sin.ENVY, Types.attack.BLUNT,
            Types.coin.REGULAR, 1, 3, 3, 2,
            Types.skillFrame.NORMAL, kickingCoinDescriptions,
            ""
    );
    
    BossSkill paybackCounter = new BossSkill(
            "Payback", Types.skill.COUNTER, "",
            Types.sin.WRATH, Types.attack.BLUNT,
            Types.coin.REGULAR, 1, 2, 12, -4,
            Types.skillFrame.NORMAL, paybackCounterDescriptions,
            ""
    );
    
    
}
