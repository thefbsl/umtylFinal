package com.example.umtylproject

class User {
    var username: String? = null
    var email: String? = null
    var uid: String? = null

    constructor()

    constructor(username: String?, email: String?, uid: String?){
        this.username = username
        this.email = email
        this.uid = uid
    }
}