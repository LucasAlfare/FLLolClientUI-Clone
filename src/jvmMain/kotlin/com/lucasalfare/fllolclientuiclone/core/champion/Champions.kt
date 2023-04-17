package com.lucasalfare.fllolclientuiclone.core.champion

class Champions {
  
  companion object {
    
    val Fizz = Champion(
      name = "Fizz",
      title = "O trapaceiro das marés",
      lore = "O Fizz é bom.",
      physicalDamage = false,
      styleLevel = .9f,
      difficultyLevel = DifficultyLevel.Hard,
      championFunction = ChampionFunction.Assassin,
      championSkills = mutableListOf(
        ChampionSkill(
          activationKey = ActivationKey.None,
          name = "Lutador ligeiro"
        ),
        ChampionSkill(
          activationKey = ActivationKey.Q,
          name = "Ataque do ouriço"
        ),
        ChampionSkill(
          activationKey = ActivationKey.W,
          name = "Tridente da pedra do mar"
        ),
        ChampionSkill(
          activationKey = ActivationKey.E,
          name = "Brincalhão / Trapaceiro"
        ),
        ChampionSkill(
          activationKey = ActivationKey.R,
          name = "Lançar isca"
        )
      ),
      proficiencies = Proficiency.createProficiencies(
        damageLevel = 3,
        resistenceLevel = 1,
        groupControlLevel = 2,
        mobilityLevel = 3,
        utilityLevel = 1
      )
    )

    val Teemo = Champion(
      name = "Teemo",
      title = "O explorador veloz",
      lore = "O Teemo é bom de mais.",
      physicalDamage = false,
      styleLevel = .4f,
      difficultyLevel = DifficultyLevel.Easy,
      championFunction = ChampionFunction.Shooter,
      championSkills = mutableListOf(
        ChampionSkill(
          activationKey = ActivationKey.None,
          name = "Técnicas de guerrilha"
        ),
        ChampionSkill(
          activationKey = ActivationKey.Q,
          name = "Dardo ofuscante"
        ),
        ChampionSkill(
          activationKey = ActivationKey.W,
          name = "Mover depressa"
        ),
        ChampionSkill(
          activationKey = ActivationKey.E,
          name = "Tiro tóxico"
        ),
        ChampionSkill(
          activationKey = ActivationKey.R,
          name = "Armadilha venenosa"
        )
      ),
      proficiencies = Proficiency.createProficiencies(
        damageLevel = 3,
        resistenceLevel = 1,
        groupControlLevel = 2,
        mobilityLevel = 1,
        utilityLevel = 1
      )
    )

    val all = mutableListOf(
      Fizz, Teemo
    )
  }
}