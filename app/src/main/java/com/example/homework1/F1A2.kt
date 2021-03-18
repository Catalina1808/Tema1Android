package com.example.homework1

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.`interface`.ActivityFragmentComunication
import kotlinx.android.synthetic.main.f1a2.*

class F1A2 : Fragment() {
    var activityFragmentComunication: ActivityFragmentComunication?=null
    companion object{
        fun newInstance(): Fragment {
        return F1A2()
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
    val view = inflater.inflate(R.layout.f1a2, container, false)
    return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_second.setOnClickListener {
            activityFragmentComunication?.onAddFragment(F2A2::class.java.name)
        }
    }
}