package adjie.santooso.ajsimpleadapter

import android.view.View
import kotlinx.android.synthetic.main.view_holder_simple_with_description.view.*

class SimpleWithDescriptionTextViewHolder(itemView: View) :
    AJBaseViewHolder<SimpleWithDescriptionText>(itemView) {
    override fun onBind(model: AJBaseModel) {
        (model as? SimpleWithDescriptionText)?.let {
            itemView.tv_simple_text.text = it.getText()
            itemView.tv_simple_description.text = it.getDescriptionText()
        }
    }
}