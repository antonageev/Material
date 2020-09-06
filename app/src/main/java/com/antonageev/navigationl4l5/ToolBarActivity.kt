package com.antonageev.navigationl4l5

import android.content.Context
import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_toolbar.*

class ToolBarActivity : AppCompatActivity() {

    companion object{
        fun start (context: Context) = Intent(context, ToolBarActivity::class.java).apply {
            context.startActivity(this)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)
        setSupportActionBar(findViewById(R.id.toolbar_buttons))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setListeners()
    }

    fun setListeners() {
        btn_show.setOnClickListener {
            progress_round.visibility = View.VISIBLE
            progress_line.visibility = View.VISIBLE
        }

        btn_hide.setOnClickListener {
            progress_round.visibility = View.INVISIBLE
            progress_line.visibility = View.INVISIBLE
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
        when (item.itemId) {
            android.R.id.home -> onBackPressed().let { true }
            else -> super.onOptionsItemSelected(item)
        }
}