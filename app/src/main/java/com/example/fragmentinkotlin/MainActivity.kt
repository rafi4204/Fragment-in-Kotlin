package com.example.fragmentinkotlin

import android.app.Fragment
import android.app.FragmentManager
import android.app.FragmentTransaction
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), First.OnFragmentInteractionListener, Second.OnFragmentInteractionListener2nd {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager
        val fT = fm.beginTransaction()
        val f = First()
        fT.replace(R.id.frameLayout, f)
        fT.commit()


    }

    override fun onFragmentInteraction2nd() {
        //  Fragment ff=new First();
        val fm = supportFragmentManager
        val fT = fm.beginTransaction()
        val f = First()
        fT.replace(R.id.frameLayout, f)
        fT.commit()
    }

    override fun onFragmentInteraction() {
        val fm = supportFragmentManager
        val fT = fm.beginTransaction()
        val f = Second()
        fT.replace(R.id.frameLayout, f)
        fT.commit()
    }
}

