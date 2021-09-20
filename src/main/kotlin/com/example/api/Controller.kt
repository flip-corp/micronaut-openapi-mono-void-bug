package com.example.api

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Controller
class Controller {

    @Get("no")
    fun nonReactive() {
    }

    @Get("mono")
    fun mono(): Mono<Void> {
        return Mono.empty()
    }

    @Get("flux")
    fun flux(): Flux<Void> {
        return Flux.empty()
    }

    @Get("mono-empty-schema")
    @ApiResponse(content =  [Content(schema = Schema())])
    fun monoEmptySchema(): Mono<Void> {
        return Mono.empty()
    }
}