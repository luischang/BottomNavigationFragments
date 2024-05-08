package com.example.bottomnavigationfragments.ui.fragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomnavigationfragments.R
import com.example.bottomnavigationfragments.ui.fragments.model.SongModel
import org.w3c.dom.Text

class SongAdapter(private var lstSong: List<SongModel>):
    RecyclerView.Adapter<SongAdapter.ViewHolder>() {

        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            val tvId: TextView = itemView.findViewById(R.id.tvId)
            val ivSong: ImageView = itemView.findViewById(R.id.ivSong)
            val tvSongAlbum: TextView = itemView.findViewById(R.id.tvAlbum)
            val tvSongArtist: TextView = itemView.findViewById(R.id.tvSongArtist)
            val tvSongName: TextView = itemView.findViewById(R.id.tvSongName)
            val tvSongTime: TextView = itemView.findViewById(R.id.tvSongTime)
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_musica, parent, false))
    }
    override fun getItemCount(): Int {
        return lstSong.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemSong = lstSong[position]
        holder.tvId.text = itemSong.id.toString()
        holder.ivSong.setImageResource(itemSong.image)
        holder.tvSongAlbum.text = itemSong.songAlbum
        holder.tvSongArtist.text = itemSong.songArtist
        holder.tvSongName.text = itemSong.songName
        holder.tvSongTime.text = itemSong.songTime
    }
}