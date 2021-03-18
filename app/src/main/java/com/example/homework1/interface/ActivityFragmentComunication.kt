package com.example.myapplication.`interface`

interface ActivityFragmentComunication {
    fun onAddFragment(TAG: String)
    fun onReplaceFragment(TAG: String)
    fun onRemoveFragment(TAG: String)
    fun onFinishActivity()

}