package com.example.misnotas.ui.lista

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.misnotas.R
import com.example.misnotas.databinding.FragmentListNotesBinding


class ListNotesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentListNotesBinding>(inflater,
            R.layout.fragment_list_notes, container, false)

        binding.fabNewNote.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_listNotesFragment_to_newNoteFragment)
        }
        return binding.root
    }


}