package org.sunny.InAction.knights;

import org.sunny.InAction.quest.Quest;

public class BraveKnight implements Knight{
  private Quest quest;

  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  @Override
  public void embarkOnQuest() {
    quest.embark();
  }
}
