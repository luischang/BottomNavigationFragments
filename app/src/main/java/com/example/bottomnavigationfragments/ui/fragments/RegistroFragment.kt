package com.example.bottomnavigationfragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.core.widget.CheckedTextViewCompat
import com.example.bottomnavigationfragments.R


class RegistroFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_registro, container, false)
        val spCountry: Spinner = view.findViewById(R.id.spCountry)
        val etFullName: EditText = view.findViewById(R.id.etFullName)
        val etEmail: EditText =view.findViewById(R.id.etEmail)
        val rgGender: RadioGroup = view.findViewById(R.id.rgGender)
        val ckLicense: CheckBox = view.findViewById(R.id.ckLicense)
        val ckCar: CheckBox = view.findViewById(R.id.ckCar)
        val btSave: Button = view.findViewById(R.id.btSave)

        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.country_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spCountry.adapter = adapter
        }
        var spCountryValue: String = ""

        spCountry.onItemSelectedListener = object :  AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                spCountryValue = parent?.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        btSave.setOnClickListener {
            var fullNameValue = etFullName.text.trim().toString()
            val emailValue = etEmail.text.trim().toString()
            val intSelectedButton = rgGender!!.checkedRadioButtonId
            val rbtSelected: RadioButton = view.findViewById(intSelectedButton)
            val genderValue = rbtSelected.text

            val allValues = "Full Name: $fullNameValue \nEmail: $emailValue \nGender: $genderValue"
                            " \nCountry: $spCountryValue \nLicense: ${ckLicense.isChecked} \nCar: ${ckCar.isChecked}"

            Toast.makeText(requireContext(), allValues, Toast.LENGTH_LONG).show()

        }


        return view
    }
}