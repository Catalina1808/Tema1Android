package com.example.homework1

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.myapplication.`interface`.ActivityFragmentComunication
import kotlinx.android.synthetic.main.f2a2.*


class F2A2 : Fragment() {
    var activityFragmentComunication: ActivityFragmentComunication?=null
    companion object{
        fun newInstance(): Fragment {
            return F2A2()
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)

        when(context){
            is ActivityFragmentComunication ->
                activityFragmentComunication=context
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.f2a2, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_third.setOnClickListener {
            activityFragmentComunication?.onReplaceFragment(F3A2::class.java.name)
        }

        button_fourth.setOnClickListener {
            activityFragmentComunication?.onRemoveFragment(F2A2::class.java.name)
        }

        button_fifth.setOnClickListener {
            activityFragmentComunication?.onFinishActivity()
        }


    }
}