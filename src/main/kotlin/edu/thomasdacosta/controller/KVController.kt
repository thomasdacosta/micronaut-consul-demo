package edu.thomasdacosta.controller

import edu.thomasdacosta.data.KvReponse
import io.micronaut.context.annotation.Value
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/consul")
class KVController {

    @Value("\${heroes.bruceWayne}")
    lateinit var heroesBruceWayne: String

    @Value("\${heroes.damianWayne}")
    lateinit var heroesDamianWayne: String

    @Value("\${heroes.dickGrayson}")
    lateinit var heroesDickGrayson: String

    @Value("\${villains.joker}")
    lateinit var villainsJoker: String

    @Value("\${villains.riddler}")
    lateinit var villainsRiddler: String

    @Value("\${villains.bane}")
    lateinit var villainsBane: String

    @Get("/kv/heroes")
    fun showKvValuesHeroes(): Array<KvReponse> {
        return arrayOf(
            KvReponse(key="heroes.bruceWayne", value = heroesBruceWayne),
            KvReponse(key="heroes.damianWayne", value = heroesDamianWayne),
            KvReponse(key="heroes.dickGrayson", value = heroesDickGrayson))
    }

    @Get("/kv/villains")
    fun showKvValuesVillains(): Array<KvReponse> {
        return arrayOf(
            KvReponse(key="villains.joker", value = villainsJoker),
            KvReponse(key="villains.riddler", value = villainsRiddler),
            KvReponse(key="villains.bane", value = villainsBane))
    }

}