package hu.lottery.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import hu.lottery.R
import hu.lottery.injector
import hu.lottery.presenter.LoginPresenter
import hu.lottery.screen.LoginScreen
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

/**
 * A login screen that offers login via email/password.
 */
class LoginActivity : AppCompatActivity(),LoginScreen {

    @Inject
    lateinit var presenter : LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        injector.inject(this)

        setContentView(R.layout.activity_login)


        btLogin.setOnClickListener {
            if(!presenter.validate( etUserName.text.toString(),etPassword.text.toString()))
                showError()
            else{
            val i= Intent(this,MenuActivity::class.java)
            //i.putExtra(AdventureChooserActivity.PLAYER_ID,)
            startActivity(i)}
        }

    }

    override fun onStart() {
        super.onStart()
        presenter.attachScreen(this)
    }
    override fun onStop() {
        super.onStop()
        presenter.detachScreen()
    }

    override fun showError() {
        Toast.makeText(
                this, "Wrong name or password",
        Toast.LENGTH_LONG
        ).show()
    }

}
