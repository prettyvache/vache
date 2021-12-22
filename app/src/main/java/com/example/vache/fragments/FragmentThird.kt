package com.example.vache.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.vache.R

class FragmentThird: Fragment(R.layout.fragment_third){
    private lateinit var button1 : Button
    private lateinit var editText : EditText
    private lateinit var textView : TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textView)
        button1 = view.findViewById(R.id.button1)
        editText = view.findViewById(R.id.editText)
        val sharedPreferences = this.getActivity()?.getSharedPreferences("pref", 0)
        val notes = sharedPreferences?.getString("NOTES", "")
        textView.text = notes
        button1.setOnClickListener {
            val note = textView.text.toString()
            val nnote = editText.text.toString()
            val result = note + "\n" + nnote
            textView.text = result
            sharedPreferences?.edit()
                ?.putString("NOTES", result)
                ?.apply()
        }



    }
}