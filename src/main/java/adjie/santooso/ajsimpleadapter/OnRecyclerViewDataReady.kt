package adjie.santooso.ajsimpleadapter

import android.widget.ViewSwitcher
import androidx.recyclerview.widget.RecyclerView

interface OnRecyclerViewDataReady<T> {
    fun getAdapter(): RecyclerView.Adapter<*>? = null
    fun getViewSwitcher(): ViewSwitcher? = null

    fun onDataReady(dataList: T) {
        getViewSwitcher()?.showPrevious()
        getAdapter()?.notifyDataSetChanged()
    }

    fun onDataNotFound() = getViewSwitcher()?.showNext()

    fun getRecyclerView(): RecyclerView? = null
    fun getLayoutResId(): Int = 0
}