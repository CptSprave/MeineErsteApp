package de.coezkalf.meineersteapp

import android.accounts.AuthenticatorDescription
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import de.coezkalf.meineersteapp.logic.MainActivityListener
import kotlinx.android.synthetic.main.main_activity_layout.*
import kotlin.String as String


class MainActivity : AppCompatActivity() {

    //region 1 Lebenszyklus
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.main_activity_layout)
        this.setContentView(R.layout.main_activity_layout)

        val mainActivityListener = MainActivityListener( currentActivity = this)

        this.imgBtnShowFirstMonster.setOnClickListener (mainActivityListener)
        this.imgBtnShowSecondMonster.setOnClickListener (mainActivityListener)
        this.imgBtnShowThirdMonster.setOnClickListener (mainActivityListener)
        this.imgBtnShowfourthMonster.setOnClickListener (mainActivityListener)

    }
    //endregion

    //region 2 Listenerhandling XML definiert

    private fun showChosenMonsterUserMessage(strContentDescription: String){
        val strUserMsg = getString(R.string.strUserMsgYouHaveChosenAMonster) + strContentDescription

        Toast.makeText(this, strUserMsg, Toast.LENGTH_LONG).show()
    }

    fun handleButtonClicksDefinedInLayout(view: View) {}
    //endregion
}
