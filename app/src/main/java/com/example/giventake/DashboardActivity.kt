package com.example.giventake

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.giventake.databinding.ActivityDashboardBinding
import fragment.HomeFragment
import fragment.NotificationFragment
import fragment.PostFragment
import fragment.ProfileFragment
import fragment.SearchFragment

class DashboardActivity : AppCompatActivity() {
    lateinit var dashboardBinding: ActivityDashboardBinding

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dashboardBinding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(dashboardBinding.root)


        replaceFragment(HomeFragment())
        dashboardBinding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> replaceFragment(HomeFragment())
                R.id.search -> replaceFragment(SearchFragment())
                R.id.post -> replaceFragment(PostFragment())
                R.id.profile -> replaceFragment(ProfileFragment())
                R.id.notification -> replaceFragment(NotificationFragment())
                else -> {}

            }
            true
        }

    }
}