package adjie.santooso.ajsimpleadapter

interface SimpleText : AJBaseModel {
    override fun getId(): Int = 1
    fun getText(): String
}