package wuyuxiao.persistence.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.transaction.annotation.Transactional
import wuyuxiao.persistence.entity.UserInfo

 interface UserInfoRepository : JpaRepository<UserInfo, Long> {

    fun  findByName( name:String): UserInfo;

     @Transactional
     @Modifying
     @Query(value = "CREATE TABLE `userinfo` (\n" +
             "  `id` int NOT NULL,\n" +
             "  `name` varchar(8) DEFAULT NULL\n" +
             ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;\n", nativeQuery = true)
     fun refreshTable()

}