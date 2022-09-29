package com.example.todoandroid.model

import com.example.todoandroid.Tarefa

data class Categoria (
    var id: Long,
    var descricao: String?,
    var tarefas: List<Tarefa>?
        ){

    override fun toString(): String {
        return descricao!!
    }
}