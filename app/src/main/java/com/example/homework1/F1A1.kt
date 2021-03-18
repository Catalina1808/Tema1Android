package com.example.homework1

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.`interface`.ActivityFragmentComunication
import kotlinx.android.synthetic.main.f1a1.*

class F1A1: Fragment() {

      companion object{
        fun newInstance(): Fragment{
            return F1A1()
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.f1a1, container, false)
    }

}