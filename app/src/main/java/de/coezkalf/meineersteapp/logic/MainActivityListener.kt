package de.coezkalf.meineersteapp.logic

import android.content.Context
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import de.coezkalf.meineersteapp.R

class MainActivityListener(private val currentActivity: Context) : View.OnClickListener {
    override fun onClick(v: View?) {
        if (v is ImageButton) showChosenMonsterUserMessage(v.contentDescription.toString())
    }

    private fun showChosenMonsterUserMessage(strContentDescription: String) {
        val strUserMsg =
            this.currentActivity.getString(R.string.strUserMsgYouHaveChosenAMonster)

        Toast.makeText(
            this.currentActivity,
           "$strUserMsg $strContentDescription",
        Toast.LENGTH_LONG
        ).show()

    }

}