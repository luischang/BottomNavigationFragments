package com.example.bottomnavigationfragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomnavigationfragments.R
import com.example.bottomnavigationfragments.ui.fragments.adapter.SongAdapter
import com.example.bottomnavigationfragments.ui.fragments.model.SongModel

class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_musica, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)

        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(PlayList())
        return view
    }

    private fun PlayList(): List<SongModel>{
        val lstSong: ArrayList<SongModel> = ArrayList()

        lstSong.add(
            SongModel(1
                        , R.drawable.linkin1
                        , "In the end"
                        , "Linkin Park"
                        ,"Hybrid Theory"
                        ,"0"
                        , "4:23")
        )
        lstSong.add(
            SongModel(2
                , R.drawable.linkin2
                , "Castle of Glass"
                , "Linkin Park"
                ,"Hybrid Theory"
                ,"0"
                , "3:44")
        )

        lstSong.add(
            SongModel(3
                , R.drawable.linkin3
                , "Numb"
                , "Linkin Park"
                ,"Hybrid Theory"
                ,"0"
                , "5:10")
        )

        lstSong.add(
            SongModel(4
                , R.drawable.linkin4
                , "One step closer"
                , "Linkin Park"
                ,"Hybrid Theory"
                ,"0"
                , "4:19")
        )

        lstSong.add(
            SongModel(5
                , R.drawable.linkin5
                , "Papercut"
                , "Linkin Park"
                ,"Hybrid Theory"
                ,"0"
                , "2:58")
        )
        return lstSong
    }


}