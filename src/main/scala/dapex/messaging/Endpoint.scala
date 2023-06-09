package dapex.messaging

import io.circe.generic.semiauto.{deriveDecoder, deriveEncoder}
import io.circe.{Decoder, Encoder}

case class Endpoint(
    resource: String,
    method: String
)

object Endpoint {
  implicit val encoder: Encoder[Endpoint] = deriveEncoder
  implicit val decoder: Decoder[Endpoint] = deriveDecoder
}
