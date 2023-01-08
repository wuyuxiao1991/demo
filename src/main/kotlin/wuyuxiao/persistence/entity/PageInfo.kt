package wuyuxiao.persistence.entity

import lombok.Data
import lombok.NoArgsConstructor
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import kotlin.properties.Delegates


@Entity
@Data
@NoArgsConstructor
@Table(name = "page_info")
 class PageInfo {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
     var id: Long? = null

    @Column(name = "page_title", nullable = false)
    private lateinit var pageTitle:String

    @Column(name = "page_subtitle", nullable = false)
    private lateinit var pageSubtitle:String

    @Column(name = "pageType", nullable = false)
    private lateinit var pageType:String

   @Column(name = "detail")
   private lateinit var detail:Map<String,String>

    @Column(name = "create_time", nullable = false)
    private lateinit var createTime:LocalDateTime

    @Column(name = "update_time")
    private lateinit var updateTime:LocalDateTime
}

