package com.example.vache.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.vache.R

class FragmentFirst: Fragment(R.layout.fragment_first) {
    private lateinit var button1: Button
    private lateinit var editText: EditText
    private lateinit var textView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText = view.findViewById(R.id.editText)
        button1 = view.findViewById(R.id.button1)
        textView = view.findViewById(R.id.textView)

        val sharedPreferences = this.getActivity()?.getSharedPreferences("IMG", 0)
        val notes = sharedPreferences?.getString("IMGLINKS", "")
        textView.text = notes
        button1.setOnClickListener {
            val imgLink = editText.text.toString()
            sharedPreferences?.edit()
                ?.putString("IMGLINKS",imgLink)
                ?.apply()
        }
    }
}