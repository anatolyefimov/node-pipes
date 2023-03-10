package com.nodepipes.core.service.execution.impl

import com.nodepipes.core.domain.model.node.Node
import com.nodepipes.core.service.execution.NodeExecutor
import com.nodepipes.core.service.execution.NodeExecutorProvider
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@Component
class NodeExecutorProviderImpl(executors: List<NodeExecutor>) : NodeExecutorProvider {

    val executors = executors.associateBy { it.nodeType() }

    override fun getNode(node: Node): Mono<NodeExecutor> {
        return executors[node.nodeType]!!.toMono()
    }

}