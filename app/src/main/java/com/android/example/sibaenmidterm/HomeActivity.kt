package com.android.example.sibaenmidterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import android.content.Intent

class HomeActivity : AppCompatActivity() {
    private lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Toast.makeText(this, "Welcome back to Home!", Toast.LENGTH_SHORT).show()

        val drawerlayout: DrawerLayout =findViewById(R.id.myDrawerLayout)
        val navView: NavigationView =findViewById(R.id.nav_view)

        toggle=ActionBarDrawerToggle(this,drawerlayout,R.string.open,R.string.close)
        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.id_home ->{
                    val iNext= Intent(this, HomeActivity::class.java)
                    startActivity(iNext)
                }
                R.id.id_profile ->{
                    val iNext= Intent(this, ProfileActivity::class.java)
                    startActivity(iNext)
                }
                R.id.id_createEvent ->{
                    val iNext= Intent(this, CreateEvent::class.java)
                    startActivity(iNext)
                }
                R.id.id_sendMessage ->{
                    val iNext= Intent(this, SendMessage::class.java)
                    startActivity(iNext)
                }
                else -> makeText(applicationContext, "Navigation Error", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}