package com.bd.bne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var currentNaviController: LiveData<NavController>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBottomNavigatorBar()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setupBottomNavigatorBar()
    }

    private fun setupBottomNavigatorBar() {

        val navGraphIds = listOf(R.navigation.first, R.navigation.second, R.navigation.third)
        val controller = bottom_navigator.setupWithNavController(
            navGraphIds,
            supportFragmentManager,
            R.id.frame_container,
            intent
        )

        controller.observe(this, Observer { nav ->
            setupActionBarWithNavController(nav)
        })

        currentNaviController = controller
    }
}
