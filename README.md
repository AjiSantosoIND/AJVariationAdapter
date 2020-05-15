# AJVariationAdapter

Ini adalah adapter untuk mempermudah developer Android untuk mengimplementasi view berupa list

# Beberapa tipe view

* ###### Simple Text :
  <img src="../assets/screenshots/view_holder_simple_text.png" width="25%" height="25%">
  Berikut contoh code untuk mengimplementasi :

  ```
  class SampleActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        val adapter = AJSimpleAdapter()
        adapter.dataList = mutableListOf(
            SimpleDataText(),
            SimpleDataText(),
            SimpleDataText(),
            SimpleDataText()
        )

        recyclerview_sample.adapter = adapter
        recyclerview_sample.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL, false
        )
    }
  }

  class SimpleDataText : SimpleText {
    override fun getText(): String = "Ini text " + System.currentTimeMillis()
  }
  ```
  
* ###### Simple Text Description :

  <insert screenshot here>
  Berikut contoh code untuk mengimplementasi :
  <insert code here>
    
* ###### Extension
  1. Menampilkan line divider pada setiap item di recyclerView.
  ```[RecyclerView].showLineDivider()```
  

> Silahkan menggunakan code ini, kalo bisa classnya jangan di rename yak :p
