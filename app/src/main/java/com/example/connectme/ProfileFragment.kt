package com.example.connectme
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editp = view.findViewById<ImageView>(R.id.editprofile)
        val followers1=view.findViewById<LinearLayout>(R.id.folowers)
        val follwing=view.findViewById<LinearLayout>(R.id.following)


        editp.setOnClickListener {

            val intent = Intent(requireContext(), edit_profile::class.java)  // Correct class name
            startActivity(intent)
        }

        followers1.setOnClickListener {

            val intent = Intent(requireContext(), followers::class.java)  // Correct class name
            startActivity(intent)
        }

        follwing.setOnClickListener {

            val intent = Intent(requireContext(), following::class.java)  // Correct class name
            startActivity(intent)
        }
    }
}
