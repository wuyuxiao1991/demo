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
@Table(name = "user_info")
 class UserInfo {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
     var id: Long? = null

    @Column(name = "name", nullable = false)
    private lateinit var name:String

    @Column(name = "password", nullable = false)
    private lateinit var password:String

    @Column(name = "authority")
    private lateinit var authority:String

    @Column(name = "create_time", nullable = false)
    private lateinit var createTime:LocalDateTime

    @Column(name = "update_time")
    private lateinit var updateTime:LocalDateTime
}

