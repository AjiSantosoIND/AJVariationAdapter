package adjie.santooso.ajsimpleadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class AJBaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun onBind(model: AJBaseModel)
}