package models

import play.api.libs.json._
import java.util.Date

case class Person1(
                   id: Long,
                   socialSecurityNumber: String,
                   name: String,
                   age: Int,
                   lastName: String,
                   previousLastName: String,
                   firstName: String,
                   otherFirstNames: String,
                   middleName: String,
                   titlePrefix: String,
                   titleSuffix: String,
                   gender: String,
                   birthDate: Date,
                   bDVerified: Boolean,
                   deathDate: Date,
                   dDVerified:  Boolean
                 )

object Person1 {
  implicit val personFormat = Json.format[Person]
}