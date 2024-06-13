package com.example.native_view

import android.app.AlertDialog
import android.content.Context
import android.view.View
import io.flutter.plugin.platform.PlatformView

class NativeView(context: Context?) : PlatformView {

    private val view = View(context)
    private val alertDialog = AlertDialog.Builder(context, android.R.style.Theme_Material_Light_Dialog)


    init {
        alertDialog.setTitle("Alert Dialog from Native")
        alertDialog.setMessage("Simple message")
        alertDialog.show()
    }


    override fun getView(): View {
        return view
    }

    override fun dispose() {
    }

}