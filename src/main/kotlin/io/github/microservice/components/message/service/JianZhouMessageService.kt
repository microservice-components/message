package io.github.microservice.components.message.service

import io.github.microservice.components.message.config.ApplicationProperties
import org.springframework.stereotype.Service

@Service
class JianZhouMessageService(private val applicationProperties: ApplicationProperties) {

    fun send(phone: String, captcha: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}