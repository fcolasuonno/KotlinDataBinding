package com.bitmastro.kotlindatabinding

import android.databinding.ObservableField
import android.view.View

/**
 * Created by fcolasuonno on 14/03/16.
 */
object MainViewModel {
    val firstName = ObservableField<String>("another test")
    var onClickChangeName = View.OnClickListener { firstName.set("test") }
}
