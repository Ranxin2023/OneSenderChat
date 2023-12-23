package com.example.filetransferclient
//class User{
//    var nickname: String? = null
//    var profileUrl: String? = null
//}
class Message {
    constructor(message: String, date:Long, nickname:String){
        this.message=message
        this.createdAt=date
        this.sender=nickname
    }
    var message: String
        get()=field
        set(msg){
            field=msg
        }
    private lateinit var sender: String
    var createdAt:Long
        set(time){
            field=time
        }
        get()=field


    fun setSender(name:String){
        this.sender=name
    }

}