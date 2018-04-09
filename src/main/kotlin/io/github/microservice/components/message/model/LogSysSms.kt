package io.github.microservice.components.message.model

import io.swagger.annotations.ApiModelProperty
import io.swagger.annotations.ApiParam
import javax.persistence.*
import javax.validation.constraints.NotNull
import java.util.Date

/**
 * Entity LogSysSms. 
 *
 * @author duiker(generated)
 */
@Table(name = "log_sys_sms")
data class LogSysSms (

        @field:Id
        @field:GeneratedValue(strategy = GenerationType.IDENTITY)
        @field:Column(name = "id")
        var id: Int? = null,

        @field:NotNull
        @field:ApiParam(required = true)
        @field:ApiModelProperty(value = "发送结果id")
        @field:Column(name = "result_id")
        var resultId: String? = null,

        @field:NotNull
        @field:ApiParam(required = true)
        @field:ApiModelProperty(value = "来源")
        @field:Column(name = "source")
        var source: String? = null,

        @field:NotNull
        @field:ApiParam(required = true)
        @field:ApiModelProperty(value = "内容")
        @field:Column(name = "content")
        var content: String? = null,

        @field:ApiModelProperty(value = "")
        @field:Column(name = "create_time")
        var createTime: Date? = null,

        @field:NotNull
        @field:ApiParam(required = true)
        @field:ApiModelProperty(value = "")
        @field:Column(name = "count")
        var count: Int? = null,

        @field:NotNull
        @field:ApiParam(required = true)
        @field:ApiModelProperty(value = "发送短信所用账号")
        @field:Column(name = "account")
        var account: String? = null

)
