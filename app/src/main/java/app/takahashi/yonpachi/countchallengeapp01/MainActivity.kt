package app.takahashi.yonpachi.countchallengeapp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.takahashi.yonpachi.countchallengeapp01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(this.root)
        }

        var count: Int = 0
        binding.countText.text = count.toString()

        binding.plusButton.setOnClickListener{
            count += 1
            binding.countText.text = count.toString()
        }
    }
}