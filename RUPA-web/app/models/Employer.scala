package models

import java.util.Date

case class Employer(
                   id: Long,
                   employerIdNumber: String,
                   name: String,
                   shortName: String,
                   fyeday: Integer,
                   fyemonth: Integer,
                   dateEstablished: Date,
                   planStatus: String,
                   planStatusDate:  Date
                 )

// TODO:  Add Form 5500 data fields

object Employer {
//  implicit val employerFormat = Json.format[Employer]
}
