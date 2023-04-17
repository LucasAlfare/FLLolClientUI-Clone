package com.lucasalfare.fllolclientuiclone.core.user

import com.lucasalfare.fllolclientuiclone.core.champion.Champion
import com.lucasalfare.fllolclientuiclone.core.champion.Champions

enum class Note {
  None,
  SMinus,
  S,
  SPlus
}

enum class Status {
  Off, Online
}

data class ChampionDetails(
  val relatedChampion: Champion,
  var points: Int = 0,
  var lastHighestNote: Note = Note.None
)

data class Summoner(
  val name: String,
  val status: Status = Status.Off,
  val level: Int,
  var numRiotPoints: Int,
  var numBlueEssensse: Int,
  val championDetails: MutableList<ChampionDetails> = mutableListOf()
)

fun main() {
  val me = Summoner(
    name = "Francisco Lucas",
    status = Status.Online,
    level = 100,
    numRiotPoints = 1000,
    numBlueEssensse = 5000,
    championDetails = mutableListOf(
      ChampionDetails(Champions.Fizz, lastHighestNote = Note.SMinus),
      ChampionDetails(Champions.Teemo, lastHighestNote = Note.SPlus)
    )
  )

  println(me)
}