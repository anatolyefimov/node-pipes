package com.nodepipes.core.service

import com.nodepipes.core.model.messaging.wrapper.NodeInput
import com.nodepipes.core.model.messaging.wrapper.NodeOutput
import reactor.core.publisher.Mono

interface GraphExecutor {

    fun execute(graphId: Long, input: NodeInput): Mono<NodeOutput>

}