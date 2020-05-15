package adjie.santooso.ajsimpleadapter

interface SimpleWithDescriptionText: AJBaseModel {
    override fun getId(): Int = 2

    fun getText(): String
    fun getDescriptionText(): String
}