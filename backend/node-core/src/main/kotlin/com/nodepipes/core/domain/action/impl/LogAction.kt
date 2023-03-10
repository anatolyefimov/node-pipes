package com.nodepipes.core.domain.action.impl

import com.nodepipes.core.domain.action.ManyToManyAction
import com.nodepipes.core.domain.messaging.wrapper.MessageCarrier
import com.nodepipes.core.domain.model.node.Node
import com.nodepipes.core.util.logger
import reactor.core.publisher.Mono


class LogAction(override val node: Node) : ManyToManyAction {

    private val log = this.logger()

    override fun invoke(input: MessageCarrier): Mono<MessageCarrier> {
        return Mono.just(input).doOnSuccess {
            log.info("node: {}, messages: {}", node, it.getMessages())
        }
    }
}