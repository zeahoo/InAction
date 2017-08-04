package org.sunny.InAction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sunny.InAction.knights.BraveKnight;
import org.sunny.InAction.knights.Knight;
import org.sunny.InAction.quest.Quest;
import org.sunny.InAction.quest.SlayDragonQuest;

@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }

  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }
}
