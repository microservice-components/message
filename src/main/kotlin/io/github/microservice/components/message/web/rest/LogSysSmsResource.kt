package io.github.microservice.components.message.web.rest

import com.baomidou.mybatisplus.plugins.Page
import io.github.microservice.components.message.model.LogSysSms
import io.github.microservice.components.message.service.LogSysSmsService
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

import javax.validation.Valid

/**
 * Rest controller. LogSysSms
 */
@RestController
@RequestMapping("/api")
class LogSysSmsResource(private val service: LogSysSmsService) {

    private val log = LoggerFactory.getLogger(javaClass)

    /**
     * Get /log_sys_sms : Create a new log_sys_sms
     *
     * @param logSysSms the log_sys_sms to create
     * @return the ResponseEntity with status 200 (OK) and with body the new logSysSms
     */
    @PostMapping("/log_sys_sms")
    fun createLogSysSms(@Valid @RequestBody logSysSms: LogSysSms): ResponseEntity<LogSysSms> {
        log.debug("REST request to save LogSysSms : {}", logSysSms)
        service.insert(logSysSms)
        return ResponseEntity.ok(logSysSms)
    }

    /**
     * PUT /log_sys_sms : Updates an existing log_sys_sms
     *
     * @param logSysSms the log_sys_sms to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated log_sys_sms
     */
    @PutMapping("/log_sys_sms")
    fun updateLogSysSms(@Valid @RequestBody logSysSms: LogSysSms): ResponseEntity<LogSysSms> {
        log.debug("REST request to update LogSysSms : {}", logSysSms)
        service.updateById(logSysSms)
        return ResponseEntity.ok(logSysSms)
    }

    /**
     * GET /log_sys_sms : get all log_sys_sms.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and with body all log_sys_sms
     */
    @SuppressWarnings("unchecked")
    @GetMapping("/log_sys_sms")
    @ApiOperation(value = "get all log_sys_sms.", response = Page::class)
    fun getAllLogSysSms(@ApiParam pageable: Page<LogSysSms>): ResponseEntity<Page<LogSysSms>> {
        val page = service.selectPage(pageable)
        return ResponseEntity.ok(page)
    }

    /**
     * GET /log_sys_sms/info : get the "id" log_sys_sms
     *
     * @param id the id of the log_sys_sms to find
     * @return
     */
    @GetMapping("/log_sys_sms/info")
    @ApiOperation(value = "get the \"id\" log_sys_sms", response = LogSysSms::class)
    fun getLogSysSms(@RequestParam id: Int?): ResponseEntity<LogSysSms> {
        log.debug("REST request to get LogSysSms : {}", id)
        val entity = service.selectById(id)
        return ResponseEntity.ok(entity)
    }

    /**
     * DELETE /log_sys_sms : delete the "id" log_sys_sms.
     *
     * @param id the id of the log_sys_sms to delete
     * @return
     */
    @DeleteMapping("/log_sys_sms")
    fun deleteLogSysSms(@RequestParam id: Int?) {
        log.debug("REST request to delete LogSysSms : {}", id)
        service.deleteById(id)
    }
}
