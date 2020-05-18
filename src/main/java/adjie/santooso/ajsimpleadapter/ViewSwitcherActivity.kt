package adjie.santooso.ajsimpleadapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recycler_view.*

class ViewSwitcherActivity : AppCompatActivity(), OnRecyclerViewDataReady<String> {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        getViewSwitcher()?.showNext()
    }

    override fun getLayoutResId(): Int = R.layout.activity_recycler_view
}