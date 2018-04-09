package io.github.microservice.components.message.service

import com.baomidou.mybatisplus.service.impl.ServiceImpl
import io.github.microservice.components.message.mapper.LogSysSmsMapper
import io.github.microservice.components.message.model.LogSysSms
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class LogSysSmsService : ServiceImpl<LogSysSmsMapper, LogSysSms>() {

    private val log = LoggerFactory.getLogger(javaClass)

}
