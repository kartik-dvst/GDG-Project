package com.example.gdgassignment
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
class gdg_profile_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gdg_profile_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.updateprofile)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val img = findViewById<ImageView>(R.id.profile_avatar)
        Glide.with(this)
            .load("https://www.google.com/imgres?q=profile%20image&imgurl=https%3A%2F%2Fstatic.vecteezy.com%2Fsystem%2Fresources%2Fthumbnails%2F032%2F176%2F191%2Fsmall%2Fbusiness-avatar-profile-black-icon-man-of-user-symbol-in-trendy-flat-style-isolated-on-male-profile-people-diverse-face-for-social-network-or-web-vector.jpg&imgrefurl=https%3A%2F%2Fwww.vecteezy.com%2Ffree-vector%2Fprofile-picture&docid=mcHMuvcXeszZoM&tbnid=fhiSVNE7bExQOM&vet=12ahUKEwi34MLsovmQAxV7cWwGHXpRA54QM3oECBgQAA..i&w=350&h=350&hcb=2&ved=2ahUKEwi34MLsovmQAxV7cWwGHXpRA54QM3oECBgQAA")
            .circleCrop()
            .into(img)
        val newuser=findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.MoveToLoginFromProfile)
        newuser.setOnClickListener {
            val it= Intent(this, MainActivity::class.java)
            startActivity(it)
        }
    }
}