package adjie.santooso.ajsimpleadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AJSimpleAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var dataList: MutableList<AJBaseModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return when (viewType) {
            1 -> {
                val itemView = inflater.inflate(
                    R.layout.view_holder_simple_text,
                    parent, false
                )

                SimpleTextViewHolder(itemView)
            }
            else -> TODO("")
        }
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is AJBaseViewHolder<*>) {
            holder.onBind(dataList[position])
        }
    }

    override fun getItemViewType(position: Int): Int = dataList[position].getId()
}
