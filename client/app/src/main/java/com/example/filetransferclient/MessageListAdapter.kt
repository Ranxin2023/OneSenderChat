package com.example.filetransferclient

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.filetransferclient.Utils
class MessageListAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private val mContext: Context
    private val mMessageList:ArrayList<Message>

    constructor(context: Context, messageList: ArrayList<Message>){
        this.mContext=context
        this.mMessageList=messageList

    }
    override fun getItemCount(): Int {
        return this.mMessageList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val message=this.mMessageList[position]
        (holder as SendMessageHolder).bind(message)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.message_sender_item, parent,false)
        return SendMessageHolder(view)

    }

    private inner class SendMessageHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val messageText : TextView =itemView.findViewById(R.id.text_message)
        private val timeText: TextView =itemView.findViewById(R.id.time_stamp)
        private val utils:Utils=Utils()

        fun bind(message:Message) {
            messageText.text=message.getMessage()
            // Format the stored timestamp into a readable String using method.
            timeText.text=this.utils.formatDateTime(message.getCreateAt(), "America/Los_Angeles")
        }
    }
}