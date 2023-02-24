package com.nodepipes.core.domain.execution

import com.nodepipes.core.domain.messaging.wrapper.NodeInput
import com.nodepipes.core.domain.messaging.wrapper.NodeOutput
import com.nodepipes.core.domain.preprocessing.NodeDefinition
import reactor.core.publisher.Mono

interface Action {

    val node: NodeDefinition

    fun apply(input: NodeInput): Mono<NodeOutput>

}