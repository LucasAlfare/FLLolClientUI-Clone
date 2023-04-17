package com.lucasalfare.fllolclientuiclone.core.champion


enum class DifficultyLevel {
  Easy, Medium, Hard
}

enum class ChampionFunction {
  Assassin,
  Fighter,
  Mage,
  Shooter,
  Support,
  Tank
}

enum class ActivationKey {
  Q, W, E, R, None
}

data class Proficiency(
  val name: String,
  var level: Int = 0,
  val description: String
) {
  companion object {

    private val damageByLevel = mutableListOf<Proficiency>()
    private val resistenceByLevel = mutableListOf<Proficiency>()
    private val groupControlByLevel = mutableListOf<Proficiency>()
    private val mobilityByLevel = mutableListOf<Proficiency>()
    private val utilityByLevel = mutableListOf<Proficiency>()

    fun createProficiencies(
      damageLevel: Int = 1,
      resistenceLevel: Int = 1,
      groupControlLevel: Int = 1,
      mobilityLevel: Int = 1,
      utilityLevel: Int = 1
    ): MutableList<Proficiency> {
      val damage = createDamage(damageLevel)
      val resistence = createResistence(resistenceLevel)
      val groupControl = createGroupControl(groupControlLevel)
      val mobility = createMobility(mobilityLevel)
      val utility = createUtility(utilityLevel)

      return mutableListOf(damage, resistence, groupControl, mobility, utility)
    }

    private fun createDamage(level: Int): Proficiency {
      val nextProficiency: Proficiency
      return if (damageByLevel.none { it.level == level }) {
        nextProficiency = Proficiency(
          name = "Dano",
          description = "A habilidade do campeão em causar dano a todos os inimigos",
          level = level
        )

        damageByLevel += nextProficiency
        nextProficiency
      } else {
        damageByLevel.first { it.level == level }
      }
    }

    private fun createResistence(level: Int): Proficiency {
      val nextProficiency: Proficiency
      return if (resistenceByLevel.none { it.level == level }) {
        nextProficiency = Proficiency(
          name = "Resistência",
          description = "A habilidade do campeão em absorver dano dos campeões inimigos",
          level = level
        )

        resistenceByLevel += nextProficiency
        nextProficiency
      } else {
        resistenceByLevel.first { it.level == level }
      }
    }

    private fun createGroupControl(level: Int): Proficiency {
      val nextProficiency: Proficiency
      return if (groupControlByLevel.none { it.level == level }) {
        nextProficiency = Proficiency(
          name = "Controle de Grupo",
          description = "A habilidade do campeão de aplicar efeitos nocivos lendidões e atordoamentos a campeões inimigos",
          level = level
        )

        groupControlByLevel += nextProficiency
        nextProficiency
      } else {
        groupControlByLevel.first { it.level == level }
      }
    }

    private fun createMobility(level: Int): Proficiency {
      val nextProficiency: Proficiency
      return if (mobilityByLevel.none { it.level == level }) {
        nextProficiency = Proficiency(
          name = "Mobilidade",
          description = "A habilidade do campeão de mover-se rapidamente pelo mapa utilizando saltos ou investidas",
          level = level
        )

        mobilityByLevel += nextProficiency
        nextProficiency
      } else {
        mobilityByLevel.first { it.level == level }
      }
    }

    private fun createUtility(level: Int): Proficiency {
      val nextProficiency: Proficiency
      return if (utilityByLevel.none { it.level == level }) {
        nextProficiency = Proficiency(
          name = "Utilidade",
          description = "A habilidade do campeão de conceder efeitos benéficos como escudos, curas ou Velocidade de Movimento para campeões aliados",
          level = level
        )

        utilityByLevel += nextProficiency
        nextProficiency
      } else {
        utilityByLevel.first { it.level == level }
      }
    }
  }
}

data class ChampionSkill(
  val name: String = "",
  val description: String = "",
  val activationKey: ActivationKey = ActivationKey.None,
  val passive: Boolean = activationKey == ActivationKey.None
)

data class ChampionSkin(val name: String, var locked: Boolean)

data class Champion(
  val name: String = "",
  val title: String = "",
  val lore: String = "",
  val physicalDamage: Boolean = false,
  val styleLevel: Float = 0f,
  val difficultyLevel: DifficultyLevel = DifficultyLevel.Easy,
  val championFunction: ChampionFunction = ChampionFunction.Assassin,
  val championSkills: MutableList<ChampionSkill> = mutableListOf(),
  val proficiencies: MutableList<Proficiency> = mutableListOf(),
  val championSkins: MutableList<ChampionSkin> = mutableListOf()
)

