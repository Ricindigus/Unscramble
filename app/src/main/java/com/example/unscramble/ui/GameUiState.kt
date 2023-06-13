package com.example.unscramble.ui

data class GameUiState(
    val currentScrambledWord: String = "",
    var isGuessedWordWrong:Boolean = false,
    val score: Int = 0,
    val currentWordCount: Int = 0,
    val isGameOver: Boolean = false
)