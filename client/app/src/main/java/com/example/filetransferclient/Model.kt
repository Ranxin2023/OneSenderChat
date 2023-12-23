package com.example.filetransferclient
//class User{
//    var nickname: String? = null
//    var profileUrl: String? = null
//}
class Message {
    private lateinit var message: String
    private lateinit var sender: String
    private var createdAt: Long = 0
    constructor(message: String, date:Long, nickname:String){
        this.message=message
        this.createdAt=date
        this.sender=nickname
    }
    fun setMessage(msg:String){
        this.message=msg
    }
    fun getMessage():String?{
        return this.message
    }
    fun setSender(name:String){
        this.sender=name
    }
    fun getCreateAt():Long{
        return this.createdAt
    }
}