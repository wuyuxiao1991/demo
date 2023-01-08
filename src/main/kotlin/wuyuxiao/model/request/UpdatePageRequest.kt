package wuyuxiao.model.request

data class UpdatePageRequest (
     val title: String,
     val subtitle: String,
     val data: Map<String, String>
     )
