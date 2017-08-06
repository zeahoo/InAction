package org.sunny.InAction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.sunny.InAction.knights.BraveKnight;
import org.sunny.InAction.knights.Knight;
import org.sunny.InAction.knights.Minstrel;
import org.sunny.InAction.quest.Quest;
import org.sunny.InAction.quest.SlayDragonQuest;

@Configuration
@EnableAspectJAutoProxy // 启动AspectJ自动代理
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }

  @Bean // 切面也需要bean注入才能使用
  public Minstrel minstrel() {
    return new Minstrel(System.out);
  }

  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }

}
