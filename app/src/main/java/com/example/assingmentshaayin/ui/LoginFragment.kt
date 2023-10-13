package com.example.assingmentshaayin.ui

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.assingmentshaayin.R
import com.example.assingmentshaayin.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding:FragmentLoginBinding
    private var meetingFragmentAdded = false
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.bind(inflater.inflate(R.layout.fragment_login, null))
        setUplistners()
        return binding.root
    }

    private fun setUplistners() {
        val sharedPreferences = requireContext().getSharedPreferences("loginPrefs", Context.MODE_PRIVATE)

        binding.checkboxRememberPassword.isChecked = sharedPreferences.getBoolean("rememberPassword", false)

        binding.btnLogin.setOnClickListener {
            handleLoginButtonClick(sharedPreferences)
        }
    }

    private fun handleLoginButtonClick(sharedPreferences: SharedPreferences) {
        val mobileNumber = binding.editNumber.text.toString()
        val password = binding.editPassword.text.toString()

        if (mobileNumber.isNotEmpty() && password.isNotEmpty()) {
            mt("Login successful")

            val editor = sharedPreferences.edit()

            if (binding.checkboxRememberPassword.isChecked) {
                editor.putString("password", password)
                editor.putBoolean("rememberPassword", true)
            } else {
                editor.remove("password")
                editor.putBoolean("rememberPassword", false)
            }

            editor.apply()

            if (!meetingFragmentAdded) {
                val meetingFragment = MeetingFragment()
                requireActivity().supportFragmentManager.beginTransaction()
                    .add(R.id.fragmentContainer, meetingFragment)
                    .addToBackStack(null)
                    .commit()
                meetingFragmentAdded = true
            }
        } else {
            mt("Please fill in both mobile number and password")
        }
    }
    private fun mt(text:String){
        Toast.makeText(activity,text,Toast.LENGTH_SHORT).show()
    }
}