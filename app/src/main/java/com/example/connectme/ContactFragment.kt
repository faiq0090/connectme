package com.example.connectme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


class ContactFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navigateButton = view.findViewById<ImageView>(R.id.backButton)

        navigateButton.setOnClickListener {

            val anotherFragment =HomeFragment()


            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, anotherFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }



}