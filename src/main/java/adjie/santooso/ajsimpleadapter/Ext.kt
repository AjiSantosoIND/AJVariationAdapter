package adjie.santooso.ajsimpleadapter

import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.showLineDivider() {
    val divider = DividerItemDecoration(this.context, RecyclerView.VERTICAL)
    this.addItemDecoration(divider)
}