import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okayButton.setOnClickListener {
            val email = emailEditText.text.toString()
            if (email.isNotEmpty()) {
                Toast.makeText(this, "Email saved: $email", Toast.LENGTH_SHORT).show()
                emailTextView.text = email // Display email in TextView
            } else {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
            }
        }

        nextButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_email", email)
            startActivity(intent)
        }
    }
}
