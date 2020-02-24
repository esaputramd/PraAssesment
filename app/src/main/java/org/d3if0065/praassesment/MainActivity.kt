package org.d3if0065.praassesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*
import org.d3if0065.praassesment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val navController = this.findNavController(R.id.navHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)



    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.navHostFragment)
        return NavigationUI.navigateUp(navController,drawerLayout)
    }

}
