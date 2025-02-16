package com.example.connectme

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment


class PostFragment : Fragment() {
    private lateinit var btnCamera: ImageButton
    private lateinit var mainImage: ImageView
    private lateinit var btnNext: TextView
    private val CAMERA_PERMISSION_CODE = 1001
    private val CAMERA_REQUEST_CODE = 1002

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_post, container, false)

        // Initialize views
        btnCamera = view.findViewById(R.id.btnCamera)
        mainImage = view.findViewById(R.id.mainImage)
        btnNext=view.findViewById(R.id.btnNext)

        // Set click listener for camera button
        btnCamera.setOnClickListener {
            checkCameraPermissionAndOpen()
        }

        btnNext.setOnClickListener {
            val intent = Intent(requireActivity(), NewPost::class.java)
            startActivity(intent)
        }
        return view
    }

    private fun checkCameraPermissionAndOpen() {
        if (ContextCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.CAMERA
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // Request permission if not granted
            requestPermissions(
                arrayOf(Manifest.permission.CAMERA),
                CAMERA_PERMISSION_CODE
            )
        } else {
            // Permission already granted, open camera
            openCamera()
        }
    }

    private fun openCamera() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { intent ->
            intent.resolveActivity(requireActivity().packageManager)?.also {
                startActivityForResult(intent, CAMERA_REQUEST_CODE)
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            CAMERA_PERMISSION_CODE -> {
                if (grantResults.isNotEmpty() &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    openCamera()
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                CAMERA_REQUEST_CODE -> {
                    // Get the image bitmap and set it to the ImageView
                    val imageBitmap = data?.extras?.get("data") as Bitmap?
                    mainImage.setImageBitmap(imageBitmap)
                }
            }
        }
    }
}