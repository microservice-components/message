package io.github.microservice.components.message.web.rest

import io.github.microservice.components.message.service.JianZhouMessageService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author hookszhang on 2018/4/8.
 */
@RestController
@RequestMapping("/rpc")
class MessageRpcResource(private val jianzhouMessageService: JianZhouMessageService) {

    @GetMapping("/sms_captcha")
    fun smsCaptcha(phone: String, captcha: String): ResponseEntity<Void> {
        jianzhouMessageService.send(phone, captcha)
        return ResponseEntity.ok().build()
    }
}

