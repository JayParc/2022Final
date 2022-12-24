package aop.ief.afinal

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        moveMain(1);
    }

    private fun moveMain(sec: Int) {
        Handler().postDelayed({
            //new Intent(현재 context, 이동할 activity)
            val intent = Intent(applicationContext, MenuActivity::class.java)
            startActivity(intent) //intent 에 명시된 액티비티로 이동
            finish() //현재 액티비티 종료
        }, (3000 * sec).toLong()) // sec초 정도 딜레이를 준 후 시작
    }
}