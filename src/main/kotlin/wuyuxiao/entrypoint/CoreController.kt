package wuyuxiao.entrypoint

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import wuyuxiao.model.BaseResponse
import wuyuxiao.model.request.GetPageRequest
import wuyuxiao.persistence.repo.UserInfoRepository
import wuyuxiao.service.TestService


@RestController
@RequestMapping("/api")
class CoreController{

    @Autowired
    private lateinit var testService: TestService

    @Autowired
    private lateinit var userInfoRepository: UserInfoRepository

    @PostMapping("/get_page")
    fun getPage(@RequestBody  getPageRequest: GetPageRequest):BaseResponse<Map<String,String>> {
        var  result= userInfoRepository.findByName("letty").id
        return  BaseResponse.ok();
    }
}
