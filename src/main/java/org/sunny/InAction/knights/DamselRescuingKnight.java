package org.sunny.InAction.knights;

import org.sunny.InAction.quest.Quest;
import org.sunny.InAction.quest.RescueDamselQuest;

public class DamselRescuingKnight implements Knight {

  private Quest quest;

  public DamselRescuingKnight() {
    this.quest = new RescueDamselQuest();
  }


  @Override
  public void embarkOnQuest() {
    quest.embark();
  }
}
