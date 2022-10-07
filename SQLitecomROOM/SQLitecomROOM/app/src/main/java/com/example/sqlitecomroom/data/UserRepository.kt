package com.example.sqlitecomroom.data

class UserRepository (private val userDao: UserDao){

    val selecUser = userDao.selectUser()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }
}