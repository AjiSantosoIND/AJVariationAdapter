package adjie.santooso.ajsimpleadapter

import android.view.View
import kotlinx.android.synthetic.main.view_holder_simple_text.view.*

class SimpleTextViewHolder(itemView: View) : AJBaseViewHolder<SimpleText>(itemView) {
    override fun onBind(model: AJBaseModel) {
        (model as? SimpleText)?.let {
            itemView.tv_simple_text.text = it.getText()
        }
    }
}

