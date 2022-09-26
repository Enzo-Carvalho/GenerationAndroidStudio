package com.example.todoandroid

data class Tarefa (
    val nome: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
    var categoria: String,
        ) {
}

