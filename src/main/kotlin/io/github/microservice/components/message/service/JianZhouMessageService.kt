package io.github.microservice.components.message.service

import com.jianzhou.sdk.BusinessService
import com.xiaoleilu.hutool.lang.Validator
import com.xiaoleilu.hutool.util.StrUtil
import io.github.microservice.components.message.config.ApplicationProperties
import org.springframework.stereotype.Service

@Service
class JianZhouMessageService(private val applicationProperties: ApplicationProperties) {

    private val JIANZHOU_ENDPOINT = "http://www.jianzhou.sh.cn/JianzhouSMSWSServer/services/BusinessService"
    private val service = BusinessService(JIANZHOU_ENDPOINT)

    fun sendSmsCaptcha(phoneNumber: String, captcha: String) {
        if (!Validator.isMobile(phoneNumber) || StrUtil.isEmpty(captcha)) {
            return
        }

        val content = "您的验证码是 $captcha 【${applicationProperties.jianzhou.signature}】"
        val result = service.sendMessage(applicationProperties.jianzhou.account, applicationProperties.jianzhou.password, phoneNumber, content)
        if (result <= 0) {
            throw RuntimeException("Send jianzhou message error! result=$result")
        }
    }
}