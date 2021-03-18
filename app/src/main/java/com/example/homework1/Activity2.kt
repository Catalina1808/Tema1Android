package com.example.homework1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.`interface`.ActivityFragmentComunication

class Activity2 : AppCompatActivity(), ActivityFragmentComunication {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        Log.e(Activity1::class.java.name, "onCreate")

        addF1A2()


    }

    override fun onStart() {
        super.onStart()
        Log.e(Activity1::class.java.name, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.e(Activity1::class.java.name, "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e(Activity1::class.java.name, "onResume")

    }

    override fun onStop() {
        super.onStop()
        Log.e(Activity1::class.java.name, "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(Activity1::class.java.name, "onDestroy")

    }
    fun addF1A2(){
        val fragmentManager= supportFragmentManager

        val transaction= fragmentManager.beginTransaction()

        val f1a2= F1A2.newInstance()

        val TAG= F1A2::class.java.name

        val addTransaction= transaction.add(
            R.id.fl_container,
            f1a2,
            TAG
        )

      // addTransaction.addToBackStack(TAG)

        addTransaction.commit()
    }


    override fun onAddFragment(TAG: String) {
        val fragmentManager= supportFragmentManager

        val transaction= fragmentManager.beginTransaction()

        val fragment=  when(TAG){
            F1A2::class.java.name ->
                F1A2.newInstance()

            F2A2::class.java.name ->
                F2A2.newInstance()

            else-> F2A2.newInstance()

        }

        val addTransaction= transaction.add(
            R.id.fl_container,
            fragment,
            TAG
        )

      // addTransaction.addToBackStack(TAG)

        addTransaction.commit()


    }

    override fun onReplaceFragment(TAG: String) {
        val fragmentManager= supportFragmentManager

        val transaction= fragmentManager.beginTransaction()

        val fragment=  when(TAG){
            F1A2::class.java.name ->
                F1A2.newInstance()

            F2A2::class.java.name ->
                F2A2.newInstance()

            F3A2::class.java.name ->
                F3A2.newInstance()

            else-> F3A2.newInstance()

        }

        val replaceTransaction= transaction.replace(
            R.id.fl_container,
            fragment,
            TAG
        )

        replaceTransaction.commit()


    }

    override fun onRemoveFragment(TAG: String) {
        val fragmentManager= supportFragmentManager

        val transaction= fragmentManager.beginTransaction()


        val fragment = fragmentManager.findFragmentByTag (TAG)

        val removeTransaction= fragment?.let { transaction.remove(it) }

        removeTransaction?.commit()


    }

    override fun onFinishActivity() {

            finish()
    }

}

