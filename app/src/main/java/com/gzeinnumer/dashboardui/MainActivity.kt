package com.gzeinnumer.dashboardui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var listMenu : MutableList<ItemMenu>? = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listMenu.let {
            it?.add(ItemMenu("Bit Coin", R.drawable.bitcoin))
            it?.add(ItemMenu("Bookmark", R.drawable.bookmark))
            it?.add(ItemMenu("Bug", R.drawable.bug))
            it?.add(ItemMenu("Chat", R.drawable.chat))
            it?.add(ItemMenu("Contact", R.drawable.contact))
            it?.add(ItemMenu("Date", R.drawable.date))
        }
        rv_item_menu.apply {
            adapter = MyAdapter(listMenu){
                Toast.makeText(applicationContext, it.title+" Clicked",Toast.LENGTH_SHORT).show()
            }
            layoutManager = GridLayoutManager(applicationContext, 2)
            hasFixedSize()
        }
    }
}
