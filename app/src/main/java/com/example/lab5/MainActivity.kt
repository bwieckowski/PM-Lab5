package com.example.lab5
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(Window1())

        val fragment1Button = findViewById<Button>(R.id.fragment1_button)
        val fragment2Button = findViewById<Button>(R.id.fragment2_button)

        fragment1Button.setOnClickListener({
            loadFragment(Window1())
        })

        fragment2Button.setOnClickListener({
            loadFragment(Window2())
        })
    }

    private fun loadFragment(fragment: androidx.fragment.app.Fragment) {
// create a FragmentManager
        val fm: FragmentManager = supportFragmentManager
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        val fragmentTransaction: FragmentTransaction = fm.beginTransaction()
        // replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit() // save the changes
    }
}